package examples.declarative.base;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;

import examples.utils.StringUtils;

public class PropertyMapping {
	private String propertyName;
	private String columnName;
	private PropertyConverter converter;

	public PropertyMapping() {
	}

	public PropertyMapping(String propertyName, String columnName, PropertyConverter converter) {
		this.propertyName = propertyName;
		this.columnName = columnName;
		this.converter = converter;
	}

	public Object getValueFromResultSet(ResultSet rs) {
		try {
			return this.converter.getValueFromResultSet(this.columnName, rs);
		}
		catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Object getValue(Object obj) {
		return this.converter.getValue(this.propertyName, obj);
	}

	public void setValue(Object obj, ResultSet rs) throws Exception {
		Object propertyValue = this.converter.getValueFromResultSet(columnName, rs);

		String setterMethodName = StringUtils.setterMethodName(this.propertyName);
		Method setter = obj.getClass().getMethod(setterMethodName, this.converter.getPropertyType());
		setter.invoke(obj, propertyValue);
	}

	public Class<?> getPropertyType() {
		return this.converter.getPropertyType();
	}

	public void setPropertyType(Class<?> type) {
		this.converter = PropertyConverter.getConverterForType(type);
	}

	// *************************************************************** //

	public String getColumnName() {
		return columnName;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public PropertyConverter getConverter() {
		return converter;
	}

	public void setConverter(PropertyConverter converter) {
		this.converter = converter;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
}
