package com.learn.FileHandling;

import java.io.FileWriter;

public class FileReaderExample {

	public static void main(String[] args) {
		try{
			
			FileWriter file=new FileWriter("D:\\rishi.txt");
			file.write("hello i am rishab");
			file.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
       System.out.println("successs");
	}

}
