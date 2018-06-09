package com.learn.threads;

public class CubbyHole {

	private int contents;
	private boolean avail=false;
	
	public synchronized int get(){
		while(avail==false){
			try{
				
				wait();
			}catch(InterruptedException e){
				
			}
			}
			avail=false;
			notify();
			
			return contents;
	}
			
	public synchronized void put(int value) {
	      while (avail == true) {
	         try {
	            wait();
	         } catch (InterruptedException e) { } 
	      }
	      contents = value;
	      avail = true;
	      notifyAll();
	   }	
					
}	
		
		
	
	

