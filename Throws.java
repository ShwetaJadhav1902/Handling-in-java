package exceptionhandling1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class Throws {
	public static void main(String[] args) throws FileNotFoundException{
		try {
		fileInfo();
		
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	System.out.println("Statement After Exception");
	}
	
    public static void fileInfo() throws  FileNotFoundException{
    	FileInputStream f=new FileInputStream("C:\\Users\\jadha\\Downloads\\bootstrap-5.3.3-dist ");
    }
}
