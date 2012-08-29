package examples.utils;

public class StringUtils {

	public static String propertyName(String methodName) {
		return methodName.substring(3, 4).toLowerCase() + methodName.substring(4);
	}
	
	public static String getterMethodName(String propertyName) {
		return "get" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
	}

	public static String setterMethodName(String propertyName) {
		return "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
	}
	
}
