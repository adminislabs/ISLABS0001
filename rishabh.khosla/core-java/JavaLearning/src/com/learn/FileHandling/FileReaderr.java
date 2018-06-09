package com.learn.FileHandling;

import java.io.FileReader;

public class FileReaderr {

	public static void main(String[] args)throws Exception {
		FileReader file =new FileReader("D:\\rishi.txt");
		int i;
		while((i=file.read())!=-1)
			System.out.println((char)i);
			file.close();
		

	}

}
