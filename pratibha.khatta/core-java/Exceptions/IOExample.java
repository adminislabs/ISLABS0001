package Exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IOExample {
	private static String filepath = "E:\\Test.txt";

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