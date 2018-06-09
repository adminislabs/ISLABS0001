package conversions;

import java.util.ArrayList;
import java.util.Scanner;

public class HexadecimalToOctal{

	public static void main(String[] args) {
		HexadecimalToBinary hb=new HexadecimalToBinary();
		ArrayList binary=new ArrayList();
		System.out.println("Enter the Hexadecimal Number");
		Scanner sc=new Scanner(System.in);
		String hexa=sc.next();
	    char[] hexa1=hexa.toCharArray();
	    for(int i=0;i<hexa1.length;i++){
	    	if(hexa1[i]=='A'){
	    		binary=hb.hexadecimalbinary(binary,10);
	    	}
	    	else if(hexa1[i]=='B'){
	    		binary=hb.hexadecimalbinary(binary,11);
	    	}
	    	else if(hexa1[i]=='C'){
	    		binary=hb.hexadecimalbinary(binary,12);
	    	}
	    	else if(hexa1[i]=='D'){
	    		binary=hb.hexadecimalbinary(binary,13);
	    	}
	    	else if(hexa1[i]=='E'){
	    		binary=hb.hexadecimalbinary(binary,14);
	    	}
	    	else if(hexa1[i]=='F'){
	    		binary=hb.hexadecimalbinary(binary,15);
	    	}
	    	else{
	    		int a=Character.getNumericValue(hexa1[i]);  
	    		binary=hb.hexadecimalbinary(binary, a);
	    		//System.out.println(y);
	    	}
	    }
	    System.out.println("The Binary reprsentation of"+hexa+" is");
     for(int j=0;j<binary.size();j++){
    	 System.out.print(binary.get(j));
     }
     System.out.println("\n");
     ArrayList octal=new ArrayList();
     octal=hb.hexadecimaltoocatal(binary);
     System.out.println("The Octal reprsentation of"+hexa+" is");
     for(int j=0;j<octal.size();j++){
    	 System.out.print(octal.get(j));
     }
	}

}
