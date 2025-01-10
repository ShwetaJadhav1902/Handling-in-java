package exceptionhandling1;

public class InvalidAgeException extends Exception {

	public InvalidAgeException() {
		super("Age is less than 18");
	}

	public InvalidAgeException(String mg) {
		super(mg);
	}
	
   
}
