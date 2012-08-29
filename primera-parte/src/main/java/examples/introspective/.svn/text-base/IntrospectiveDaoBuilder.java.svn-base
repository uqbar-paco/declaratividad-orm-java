package examples.introspective;

import java.lang.reflect.Method;

import org.springframework.jdbc.core.JdbcTemplate;

import examples.declarative.annotations.AnnotatedDaoDeclaration;
import examples.declarative.base.PropertyConverter;
import examples.utils.StringUtils;

public class IntrospectiveDaoBuilder<T> extends AnnotatedDaoDeclaration<T> {
	public IntrospectiveDaoBuilder(JdbcTemplate jdbcTemplate, String mappedClassName) throws Exception {
		super(jdbcTemplate, mappedClassName);
	}

	@Override
	protected String getTableName() {
		return this.getMappedClass().getSimpleName().toUpperCase();
	}

	@Override
	protected boolean isProperty(Method method) {
		return method.getName().startsWith("get") && method.getName() != "getClass";
	}

	@Override
	protected String getColumnName(Method method) {
		return method.isAnnotationPresent(Column.class) //
			? method.getAnnotation(Column.class).value()
			: StringUtils.propertyName(method.getName()).toUpperCase();
	}

	@Override
	protected PropertyConverter getConverter(Method method) throws InstantiationException, IllegalAccessException {
		return PropertyConverter.getConverterForType(method.getReturnType());
	}
}
