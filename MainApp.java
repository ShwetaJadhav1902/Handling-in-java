package exceptionhandling1;
import java.util.Scanner;

public class MainApp {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your Age:");
	int age=sc.nextInt();
	
	if(age>=18) {
		System.out.println("Vote Here.\n.BJP \n.NCP");
	}else {
		try {
			//throw new InvalidAgeException();
			throw new InvalidAgeException("Age is not valid");
		}catch(Exception e){
		//e.printStackTrace();
			
			System.out.println(e.getMessage());
	}
}
}
}