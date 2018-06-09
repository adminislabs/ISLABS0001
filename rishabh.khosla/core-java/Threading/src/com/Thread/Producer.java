package com.Thread;

public class Producer extends Thread {
	public GunnyBag hole;
	public Producer(GunnyBag c){
		hole=c;
	}
	
	public synchronized void run(){
		synchronized (hole){
		for(int i=0;i<=10;i+=2){
			hole.put(i);
			System.out.println("the thread put in hole "+i);
			
		}
		}
		
		
		
	}
	

}
