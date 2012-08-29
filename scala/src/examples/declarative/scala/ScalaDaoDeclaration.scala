package examples.declarative.scala;

import examples.base.SimpleEmail;
import org.springframework.jdbc.core.JdbcTemplate;

class ScalaDaoDeclaration extends BaseDeclaration[SimpleEmail] {
 	"EMAIL" maps (
		"fromAddress" inColumn "FROMEMAIL",
		"toAddress" inColumn "TOEMAIL", 
		"subject",
		"message",
		"sent" asDate
	)

}

