package com.Thread;

public class Consumer extends Thread{
	
	public GunnyBag hole;
	
	public Consumer(GunnyBag c){
		hole=c;
	}
	
	
	public  synchronized void run(){
		
		synchronized (hole){
		int value=0;
		for(int i=0;i<=20;i++){
			value=hole.get();
			System.out.println("the user name"+getName() +"the user get the hole"+value);
			
			
		}
		}
	}
	
	
	
}
