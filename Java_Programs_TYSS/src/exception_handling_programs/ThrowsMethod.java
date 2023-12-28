package exception_handling_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ThrowsMethod {
	static String newFile="Sample.txt";
	
	public static void createNewFile() throws Throwable {
		File file=new File(newFile);
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("File created");
		} else {
			System.out.println("File already exist");
		}
	}
	
	public static void writingToTheFile() throws Throwable {
		FileOutputStream fos = new FileOutputStream(newFile);
		String s1="I live in Bengaluru.\n";
		fos.write(s1.getBytes());
		String s2="I am in TYSS.\n";
		fos.write(s2.getBytes());
		fos.close();
	}
	
	public static void readingFromFile() throws Throwable {
		FileInputStream fis=new FileInputStream(newFile);
		int i=fis.read();
		while (i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
		fis.close();
	}
	
	public static void main(String[] args) throws Throwable {
		createNewFile();
		writingToTheFile();
		readingFromFile();
	}
}
