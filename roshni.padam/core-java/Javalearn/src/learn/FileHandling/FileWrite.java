package learn.FileHandling;

import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) {
try{
			
			FileWriter file=new FileWriter("E:\\roshni.txt");
			file.write("enter the text here");
			file.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
       System.out.println("success");
	}

	}


