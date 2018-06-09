package com.pcticesra;

public class Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=1; 
		int result;
		for (int k=1; k<=4 ;k++) {
		result=i+j;
		System.out.println(result);
		i=j;
		j=result; 
		
		
		}

	}

}
