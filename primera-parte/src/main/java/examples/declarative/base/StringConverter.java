package examples.declarative.base;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StringConverter extends PropertyConverter {

	@Override
	public Class<?> getPropertyType() {
		return String.class;
	}

	@Override
	public Object getValueFromResultSet(String columnName, ResultSet rs) throws SQLException {
		return rs.getString(columnName);
	}
}
