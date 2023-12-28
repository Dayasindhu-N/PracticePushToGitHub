package file_handling_programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingNewFile {
	public static void main(String[] args) throws IOException {
		File file=new File("Sample.txt");
		if (!file.exists()) {
			System.out.println("File is created");
			file.createNewFile();
		} else {
			System.out.println("File is already created");
		}
		FileOutputStream fos = new FileOutputStream(file);
		String s1="I live in Bengaluru.\n";
		String s2="I am working in TYSS from past 3 months.\n";
		fos.write(s1.getBytes());
		fos.write(s2.getBytes());
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