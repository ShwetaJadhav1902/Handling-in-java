package filehandling;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\jadha\\OneDrive\\Desktop\\file.txt");
		if(f.exists()) {
			System.out.println("File Found Successfully");
			System.out.println("Name of file:"+f.getName());
			System.out.println("Lovation of file:"+f.getAbsolutePath());
			System.out.println("Size of file:"+f.length()+"Byte");
			System.out.println("Can Readable:"+f.canRead());
			System.out.println("can Writable:"+f.canWrite());
			System.out.println("Can Executable:"+f.canExecute());
		}else {
			System.out.println("File Not Found");
		}
	}

}
