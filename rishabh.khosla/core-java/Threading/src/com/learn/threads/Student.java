package com.learn.threads;

public class Student {
	int amount=1000;
	 synchronized void withdraw(int amount){
		System.out.println("going to withdrwa");
		if(this.amount<amount){
			System.out.println("less balance");
			
			try{wait();}
			catch(Exception e){
		}}
		this.amount-=amount;
		System.out.println("withraw completed");
		
		}
		
	
		void deposit(int amount){
			this.amount+=amount;
			System.out.println("deposit complete");
			notify();
			
			
		}
	

}
