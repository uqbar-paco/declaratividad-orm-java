package examples.declarative.annotations;

import java.util.Date;

import examples.base.Email;
import examples.declarative.base.DateConverter;
import examples.declarative.base.StringConverter;

@MappedClass(table = "EMAIL")
public class AnnotatedEmail implements Email {
	private String message;
	private String fromAddress;
	private String toAddress;
	private String subject;
	private Date sent;

	@MappedProperty(column = "FROMEMAIL", converter = StringConverter.class)
	public String getFromAddress() {
		return this.fromAddress;
	}

	@MappedProperty(column = "TOEMAIL", converter = StringConverter.class)
	public String getToAddress() {
		return this.toAddress;
	}

	@MappedProperty(column = "SUBJECT", converter = StringConverter.class)
	public String getSubject() {
		return this.subject;
	}

	@MappedProperty(column = "MESSAGE", converter = StringConverter.class)
	public String getMessage() {
		return this.message;
	}

	@MappedProperty(column = "SENT", converter = DateConverter.class)
	public Date getSent() {
		return this.sent;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setSent(Date sent) {
		this.sent = sent;
	}

}
