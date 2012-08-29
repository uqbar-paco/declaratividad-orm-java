package examples.declarative.scala

import examples.base._;

import java.lang.reflect.ParameterizedType;

import examples.declarative.base.GenericDao;
import examples.declarative.base.PropertyConverter;
import examples.declarative.base.StringConverter;
import examples.declarative.base.DateConverter;
import org.springframework.jdbc.core.JdbcTemplate;

abstract class BaseDeclaration[A]() {
	var jdbc: JdbcTemplate = null
	
	var tableName: String = null
	var mappings: List[PropertyMapping] = null
	

	def createDao: GenericDao[A]= {
		val mappedType:Class[A] = getClass
			.getGenericSuperclass
			.asInstanceOf[ParameterizedType]
			.getActualTypeArguments()(0)
			.asInstanceOf[Class[A]];

		val dao: GenericDao[A] = new GenericDao[A](jdbc, mappedType, tableName);

		for (property <- mappings) 
			yield dao.addProperty(property.name, property.columnName, property.converter)
			
		return dao;
	}

	def setJdbcTemplate(template:JdbcTemplate):Unit = this.jdbc = template
	
	// **********************************************************************
	// ** Property Mapping
	// **********************************************************************
	
	implicit def asPropertyMapping(property:String) = new PropertyMapping(property)

	class PropertyMapping(propertyName:String) {
		def name = propertyName
		var columnName:String = propertyName;
		var converter:PropertyConverter = new StringConverter();
		
		def inColumn(columnName:String):PropertyMapping = {
			this.columnName = columnName;
			return this
		}
		
		def asDate:PropertyMapping = {
			this.converter = new DateConverter();
			return this;
		}
	}

	// **********************************************************************
	// ** Property Mapping
	// **********************************************************************

	implicit def asTableMapping(tableName:String):TableMapping = new TableMapping(tableName)
	
	class TableMapping(tableName:String) {
		def maps(mappings: PropertyMapping*):TableMapping = {
			BaseDeclaration.this.tableName = this.tableName;
			BaseDeclaration.this.mappings = mappings toList;
			return this;
		}
	}
}