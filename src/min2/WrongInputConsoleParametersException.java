package min2;

public class WrongInputConsoleParametersException extends Exception{
	private static final long serialVersionUID = 1L;
	private String message;

	public WrongInputConsoleParametersException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
