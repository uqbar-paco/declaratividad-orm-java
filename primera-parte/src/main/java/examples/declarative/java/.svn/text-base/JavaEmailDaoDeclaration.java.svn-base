package examples.declarative.java;

import org.springframework.jdbc.core.JdbcTemplate;

import examples.base.Dao;
import examples.base.SimpleEmail;
import examples.declarative.base.DateConverter;
import examples.declarative.base.GenericDao;
import examples.declarative.base.StringConverter;

public class JavaEmailDaoDeclaration {
	public static Dao<SimpleEmail> createDao(JdbcTemplate jdbcTemplate) {
		return new GenericDao<SimpleEmail>(jdbcTemplate, SimpleEmail.class, "EMAIL")//
			.addProperty("fromAddress", "FROMEMAIL", new StringConverter())
			.addProperty("toAddress", "TOEMAIL", new StringConverter())
			.addProperty("subject", "SUBJECT", new StringConverter())
			.addProperty("message", "MESSAGE", new StringConverter())
			.addProperty("sent", "SENT", new DateConverter());
	}
}
