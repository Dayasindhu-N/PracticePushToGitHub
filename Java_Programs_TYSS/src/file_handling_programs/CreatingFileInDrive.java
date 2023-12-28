package file_handling_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingFileInDrive {
	public static void main(String[] args) throws IOException {
		File file=new File("D://FileHandling//Sample.txt");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("File is created");
		} else {
			System.out.println("File already exist");
		}
		
		FileOutputStream fos=new FileOutputStream(file);
		String s1="I live in Bengaluru\n";
		fos.write(s1.getBytes());
		fos.close();
		
		FileInputStream fis=new FileInputStream(file);
		int i=fis.read();
		while (i!=-1) {
			System.out.print((char)i);
			i=fis.read();
		}
		fis.close();
	}
}
