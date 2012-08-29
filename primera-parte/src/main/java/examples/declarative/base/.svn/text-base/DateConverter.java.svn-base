package examples.declarative.base;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class DateConverter extends PropertyConverter {

	@Override
	public Class<?> getPropertyType() {
		return Date.class;
	}

	@Override
	public Object getValueFromResultSet(String columnName, ResultSet rs) throws SQLException {
		return rs.getDate(columnName);
	}

}
