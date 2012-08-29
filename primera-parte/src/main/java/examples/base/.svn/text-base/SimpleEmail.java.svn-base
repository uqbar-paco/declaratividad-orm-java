package examples.base;

import java.util.Date;

public class SimpleEmail implements Email {
	private String message;
	private String fromAddress;
	private String toAddress;
	private String subject;
	private Date sent;

	public SimpleEmail() {
	}

	public SimpleEmail(String from, String to, String subject, String message, Date date) {
		this.fromAddress = from;
		this.toAddress = to;
		this.subject = subject;
		this.message = message;
		this.sent = date;
	}

	public String getMessage() {
		return message;
	}

	public String getFromAddress() {
		return fromAddress;
	}

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
