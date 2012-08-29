package examples.declarative.base;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import examples.utils.StringUtils;

public abstract class PropertyConverter {
	public Object getValue(String propertyName, Object obj) {
		try {
			Class<?> mappedClass = obj.getClass();
			Method method = mappedClass.getMethod(StringUtils.getterMethodName(propertyName));
			return method.invoke(obj);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public abstract Class<?> getPropertyType();

	public abstract Object getValueFromResultSet(String columnName, ResultSet rs) throws SQLException;

	// *************************************************************** //

	public static PropertyConverter getConverterForType(Class<?> type) {
		if (type.equals(String.class)) {
			return new StringConverter();
		}
		else if (type.equals(Date.class)) {
			return new DateConverter();
		}
		else {
			throw new RuntimeException("Cannot create converter for " + type.getName());
		}
	}
}
