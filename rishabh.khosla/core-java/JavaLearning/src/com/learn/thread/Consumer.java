package com.learn.thread;

public class Consumer extends Thread {
public Bukket hole;
	public Consumer(Bukket n){
		hole=n;
	}

	public void run(){
		
		int result;
		for(int i=0;i<=20;i++){
			synchronized(hole){
				
			
			result=hole.get();
			System.out.println( "Thread name" +Thread.currentThread() +"the consumer got the this resullt"+result);
			
		}
		
	}
	}
	
	
	
}
