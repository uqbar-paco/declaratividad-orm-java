package examples.declarative.base;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import examples.base.Dao;

public class GenericDao<T> implements Dao<T> {
	private JdbcTemplate jdbcTemplate;

	private Class<T> mappedClass;
	private String tableName;

	private List<PropertyMapping> mappings = new ArrayList<PropertyMapping>();

	public GenericDao() {
	}

	public GenericDao(JdbcTemplate jdbcTemplate, Class<T> mappedClass, String tableName) {
		this.jdbcTemplate = jdbcTemplate;
		this.mappedClass = mappedClass;
		this.tableName = tableName;
	}

	public GenericDao<T> addProperty(String propertyName, String columnName, PropertyConverter converter) {
		return this.addProperty(new PropertyMapping(propertyName, columnName, converter));
	}

	public GenericDao<T> addProperty(PropertyMapping mapping) {
		this.mappings.add(mapping);
		return this;
	}

	public void add(T obj) {
		String fieldNames = "";
		String questionMarks = "";
		List<Object> values = new ArrayList<Object>();

		for (Iterator<PropertyMapping> it = this.mappings.iterator(); it.hasNext();) {
			PropertyMapping mapping = it.next();

			fieldNames += mapping.getColumnName();
			questionMarks += "?";
			values.add(mapping.getValue(obj));

			if (it.hasNext()) {
				fieldNames += ", ";
				questionMarks += ", ";
			}
		}

		String query = "INSERT INTO " + this.tableName + " (" + fieldNames + ") VALUES (" + questionMarks + ")";
		this.jdbcTemplate.update(query, values.toArray());
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return this.jdbcTemplate.query("select * from EMAIL;", new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				try {
					Object result = mappedClass.newInstance();
					for (PropertyMapping mapping : GenericDao.this.mappings) {
						mapping.setValue(result, rs);
					}
					return result;
				}
				catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		});
	}

	/**
	 * Esto no sirve más pero lo dejo como otro ejemplo de reflection.
	 */
	@SuppressWarnings("unchecked")
	public List<T> oldFindAll() {
		return this.jdbcTemplate.query("select * from EMAIL;", new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				try {
					List<Class> types = new ArrayList<Class>();
					List<Object> arguments = new ArrayList<Object>();
					for (PropertyMapping mapping : GenericDao.this.mappings) {
						types.add(mapping.getPropertyType());
						arguments.add(mapping.getValueFromResultSet(rs));
					}

					Constructor<T> constructor = mappedClass.getConstructor(types.toArray(new Class[] {}));
					return constructor.newInstance(arguments.toArray());
				}
				catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		});
	}

	// *************************************************************** //

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Class<T> getMappedClass() {
		return mappedClass;
	}

	public void setMappedClass(Class<T> mappedClass) {
		this.mappedClass = mappedClass;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

}
