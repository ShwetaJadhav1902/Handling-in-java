package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteinFile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter information which you have stored in file!!!");
		String input=sc.nextLine();
		try {
			FileOutputStream f=new FileOutputStream("C:\\Users\\jadha\\OneDrive\\Desktop\\file.txt",true);
			
			for(int i=0;i<input.length();i++) {
				f.write(input.charAt(i));
			}
			f.close();
			System.out.println("Data written in file successfully");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}

}
