package com.learn.threads;

public class CromeThread extends Thread{
	Synchronized r;
	public CromeThread(Synchronized r){
		this.r=r;
		
		
	}
	public void run(){
		
		r.print(10);
	}
	
	

}
