package learn.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {

	public static void main(String[] args) {
		try {	 File roshni = new File("C://file.txt");
		 FileReader gdrg= new FileReader("roshni");
	}
	
	catch(FileNotFoundException e) {
		System.out.println("2fileee");
		
	}

	}}
