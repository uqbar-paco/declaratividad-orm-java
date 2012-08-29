package examples.introspective;

import java.util.Date;


public class Email implements examples.base.Email {
	private String message;
	private String fromAddress;
	private String toAddress;
	private String subject;
	private Date sent;

	public String getMessage() {
		return message;
	}

	@Column("FROMEMAIL")
	public String getFromAddress() {
		return fromAddress;
	}

	@Column("TOEMAIL")
	public String getToAddress() {
		return toAddress;
	}

	public String getSubject() {
		return subject;
	}

	public Date getSent() {
		return sent;
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
