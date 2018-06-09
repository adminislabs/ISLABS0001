package fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		int i;
		FileReader fr=new FileReader("E:\\New Text Document.txt");
        while((i=fr.read())!=-1){
        	System.out.println((char)i);
        	
        }
        fr.close();
	}

}
