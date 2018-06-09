package conversions;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimaltoBinary {

	public static void main(String[] args) {
      ArrayList binary=new ArrayList();
      int i=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the decimal number u want to convert");
      int decimal=sc.nextInt();
      while(decimal>0){
    	  binary.add(decimal%2);
    	  decimal=decimal/2;
    	  i++;
      }
     for(int j=binary.size()-1;j>=0;j--){
    	 System.out.println(binary.get(j));
     }
	}

}
