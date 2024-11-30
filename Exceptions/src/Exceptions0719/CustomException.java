package Exceptions0719;

@SuppressWarnings("serial")
public class CustomException extends Throwable {

	public CustomException(String message, Throwable e) {
		super(message, e);
	}
}
