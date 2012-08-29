package examples.imperative;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import examples.base.Email;
import examples.base.Dao;
import examples.base.SimpleEmail;

/**
 * @author ccancinos
 */
public class ImperativeEmailDao implements Dao<Email> {
	public JdbcTemplate jdbcTemplate;

	public ImperativeEmailDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(Email email) {
		this.jdbcTemplate.update(//
			"INSERT INTO EMAIL (FROMEMAIL, TOEMAIL, SUBJECT, MESSAGE, SENT) VALUES (?, ?, ?, ?, ?)", //
			new Object[] { email.getFromAddress(), //
				email.getToAddress(), //
				email.getSubject(), //
				email.getMessage(), //
				new java.sql.Date(email.getSent().getTime()) });
	}

	@SuppressWarnings("unchecked")
	public List<Email> findAll() {
		return this.jdbcTemplate.query("select * from EMAIL;", new RowMapper() {
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new SimpleEmail(//
					rs.getString("FROMEMAIL"), //
					rs.getString("TOEMAIL"), //
					rs.getString("SUBJECT"), //
					rs.getString("MESSAGE"),//
					rs.getDate("SENT"));
			}
		});
	}
}
