package com.trainig.exception;

public class Exception {

	public Exception(String m) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	try{int number1 =10;
	int number2=0;
	int result=(number1/number2);
	System.out.println("the division of two num is :"+result);
	}catch(ArithmeticException e){
		System.out.println(e);
		System.out.println("rest of codr ");
		
		
		
		
		
	}

	}
}

