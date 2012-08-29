package examples.declarative.annotations;

import java.lang.reflect.Method;

import org.springframework.jdbc.core.JdbcTemplate;

import examples.base.Dao;
import examples.declarative.base.GenericDao;
import examples.declarative.base.PropertyConverter;
import examples.utils.StringUtils;

public class AnnotatedDaoDeclaration<T> {
	private final JdbcTemplate jdbcTemplate;
	private final Class<T> mappedClass;

	@SuppressWarnings("unchecked")
	public AnnotatedDaoDeclaration(JdbcTemplate jdbcTemplate, String mappedClassName) throws Exception {
		this.jdbcTemplate = jdbcTemplate;
		this.mappedClass = (Class<T>) Class.forName(mappedClassName);

	}

	public Dao<T> createDao() throws Exception {
		String tableName = this.getTableName();
		GenericDao<T> dao = new GenericDao<T>(jdbcTemplate, mappedClass, tableName);

		for (Method method : this.mappedClass.getMethods()) {
			if (this.isProperty(method)) {
				dao.addProperty(StringUtils.propertyName(method.getName()), this.getColumnName(method), this
					.getConverter(method));
			}
		}

		return dao;
	}

	protected String getTableName() {
		return this.mappedClass.getAnnotation(MappedClass.class).table();
	}

	protected Class<T> getMappedClass() {
		return this.mappedClass;
	}

	protected boolean isProperty(Method method) {
		return method.isAnnotationPresent(MappedProperty.class);
	}

	protected String getColumnName(Method method) {
		return method.getAnnotation(MappedProperty.class).column();
	}

	protected PropertyConverter getConverter(Method method) throws InstantiationException, IllegalAccessException {
		return method.getAnnotation(MappedProperty.class).converter().newInstance();
	}
}
