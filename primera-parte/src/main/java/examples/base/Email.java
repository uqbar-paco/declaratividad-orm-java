package examples.base;

import java.util.Date;

public interface Email {
	public String getMessage();

	public String getFromAddress();

	public String getToAddress();

	public String getSubject();

	public Date getSent();
}
