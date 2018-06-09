package exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOExceptionExample {
	private static String filepath = "C:\\Users\\SAHIL AHUJA\\Desktop\\New Text Document.txt";

	public static void main(String[] args) {
		BufferedReader br = null;

		String line;
		try {
			br = new BufferedReader(new FileReader(filepath));

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.err.println("An IOException was caught :" + e.getMessage());
		}

	}

}
