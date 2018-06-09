package com.learn.debug;

public class Pattern3 {

	public static void main(String[] args) {
      
		 for(int i=0;i<=4;i++){
			 
			 if(i==0||i==4){
			 for(int k=0;k<=i;k++){
				 System.out.print(" ");
			 }
			 for(int j=0;j<=4;j++){
				 System.out.print("*");
				 
			 }
			
		 }
		 else{
			 for(int k=0;k<=i;k++){
				 System.out.print(" ");
			 }
				 for(int j=0;j<=4;j++){
					 if(j==0||j==4){
						 System.out.print("*");
					 }
					 else{
						 System.out.print(" ");
					 }
					 
					 
				 }
				
			 
		 }
			 
			 System.out.println();
			 
		 }


	}

}
