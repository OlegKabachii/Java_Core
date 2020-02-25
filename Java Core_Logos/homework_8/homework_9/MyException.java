package homework_9;

public class MyException extends Exception{
	private String message;

	public String getMessage() {
		return message;
	}

	public MyException(String message) {
		super(message);
		this.message = message;
	}
	
	
	
	
}
