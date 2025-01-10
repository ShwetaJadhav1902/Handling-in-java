package filehandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;

public class ReadinFile {
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\jadha\\OneDrive\\Desktop\\file.txt");
			int data=0;
			while((data=f.read())!=-1) {
				System.out.print((char)data);
			}
			f.read();
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
