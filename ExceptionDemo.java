package exceptionhandling1;
import java.util.InputMismatchException;

public class ExceptionDemo {
  public static void main(String[] args) {
	int a=25;
	int b=3;
	 
	if(b==5) {
		throw new InputMismatchException();
	}
	else {
		System.out.println(a/b);
	}
}
}
