package exceptTask;

public class SpecialCharException extends RuntimeException {
	public SpecialCharException() {;}

	public SpecialCharException(String input) {
		super(input);
	}
	
}
