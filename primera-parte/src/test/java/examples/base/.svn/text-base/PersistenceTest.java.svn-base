package examples.base;

import java.util.Date;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import examples.base.Email;

/**
 * 
 * @author ccancinos
 */
public class PersistenceTest extends TestCase {
	private Dao<Email> emailDao;
	protected ClassPathXmlApplicationContext context;

	private String vendedorChinoEmail = "vendedorChino@simpsons.com";
	private String homeroEmail = "doh@simpsons.com";
	private String subject = "Regalo a Bart";
	private JdbcTemplate jdbcTemplate;

	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		this.context = new ClassPathXmlApplicationContext("appContext.xml");
		this.jdbcTemplate = (JdbcTemplate) this.context.getBean("jdbcTemplate");
		this.emailDao = (Dao<Email>) this.context.getBean("emailDao");
		this.initializeDB();
	}

	public void testSize() throws Exception {
		assertEquals(12, this.emailDao.findAll().size());
	}

	public void testInsert() throws Exception {
		Email email = new SimpleEmail(homeroEmail, vendedorChinoEmail, "nuevo mail", "", new Date());
		this.emailDao.add(email);

		assertEquals(13, this.emailDao.findAll().size());
	}

	public void testAllMessagesSameThread() throws Exception {
		for (Email email : this.emailDao.findAll()) {
			if (!email.getSubject().equals(this.subject)) {
				failNotEquals("There is a message from a different thread.", this.subject, email.getSubject());
			}
		}
	}

	private void initializeDB() {
		jdbcTemplate.execute(//
			"create table EMAIL (FROMEMAIL varchar(255), TOEMAIL varchar(255), SUBJECT varchar(255), MESSAGE varchar(255), SENT timestamp)");

		this.insert(vendedorChinoEmail, homeroEmail, subject,
			"tome este objeto, pelo cuilado, tiene una olible maldicion");
		this.insert(homeroEmail, vendedorChinoEmail, subject, "uuuuy que mal!");
		this.insert(vendedorChinoEmail, homeroEmail, subject, "y le doy congul glatis");
		this.insert(homeroEmail, vendedorChinoEmail, subject, "que bien!");
		this.insert(vendedorChinoEmail, homeroEmail, subject, "el congul tambien esta maldito");
		this.insert(homeroEmail, vendedorChinoEmail, subject, "que mal!");
		this.insert(vendedorChinoEmail, homeroEmail, subject, "pelo usted esoje la cubielta");
		this.insert(homeroEmail, vendedorChinoEmail, subject, "que bien!");
		this.insert(vendedorChinoEmail, homeroEmail, subject, "la cubielta tiene benzoato de potasio");
		this.insert(homeroEmail, vendedorChinoEmail, subject, ":-|");
		this.insert(vendedorChinoEmail, homeroEmail, subject, "que mal...");
		this.insert(homeroEmail, vendedorChinoEmail, subject, "ya puedo irme?");
	}

	private void insert(String from, String to, String subject, String message) {
		this.jdbcTemplate.update(
			"INSERT INTO EMAIL (FROMEMAIL, TOEMAIL, SUBJECT, MESSAGE, SENT) VALUES (?, ?, ?, ?, ?)", new Object[] {
				from, to, subject, message, new java.sql.Date(new Date().getTime()) });

	}

	protected void tearDown() throws Exception {
		this.jdbcTemplate.execute("drop table EMAIL");
	}

}
