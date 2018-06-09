package com.trainig.exception;

public class Age {

	static void validate(int age )throws AgeInvalidException{
		if(age<18)
		throw new AgeInvalidException("not valid");
		else
			System.out.println("welcome to vote");
	}
	public static void main(String args[]){
	try{	validate(10);
		
		
		
	}catch(Exception e){
		System.out.println(e);
	}
	}
