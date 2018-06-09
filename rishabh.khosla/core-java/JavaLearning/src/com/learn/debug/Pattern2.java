package com.learn.debug;

public class Pattern2 {

	public static void main(String[] args) {
	for(int i=1;i<6;i++){
		if(i==1||i==5){
			for(int j=1;j<6;j++){
				System.out.print("*");
			
		}
		System.out.println();
		
	}
	 
	if(i>=1&&i<=6){
		for(int j=1;j<6;j++){   
			if(j==1||j==5){
				System.out.print("*");}
			else{
				System.out.print(" ");
			}
		
	   }
		System.out.println();
		}

	}

	}}
