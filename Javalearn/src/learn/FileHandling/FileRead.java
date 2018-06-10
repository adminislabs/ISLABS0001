package learn.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		FileReader file = null;
		try {
			file = new FileReader("E:\\roshni.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int a;
		while((a=file.read())!=-1)
			System.out.println((char)a);
			file.close();
		

	}

}
