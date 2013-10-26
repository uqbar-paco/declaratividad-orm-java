package examples.declarative.base;

import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

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
		Map<Class<?>, PropertyConverter> converters = new HashMap<Class<?>, PropertyConverter>();
		converters.put(String.class, new StringConverter());
		converters.put(Date.class, new DateConverter());
		if(!converters.containsKey(type)) {
			throw new RuntimeException("Cannot create converter for " + type.getName());
		}
		return converters.get(type);
	}
}
