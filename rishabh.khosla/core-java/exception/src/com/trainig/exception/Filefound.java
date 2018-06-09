package com.trainig.exception;
import java.io.*;

public class Filefound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try{	File rishi=new File("D://file.txt");
		FileReader rr=new FileReader(rishi);
		
		
	}
	
	catch(FileNotFoundException e){
		System.out.println(e);
		System.out.println("file not exists at this place");
		System.out.println("rishi");
	}
	}

}
