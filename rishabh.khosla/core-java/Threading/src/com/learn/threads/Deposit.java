package com.learn.threads;

public class Deposit extends Thread {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student s=new Student();
     new Thread(){
    	 public void run(){
    		 s.withdraw(500);
    	 }
     } .start();
     
	
		
		
		
		
		
		
	}

}
