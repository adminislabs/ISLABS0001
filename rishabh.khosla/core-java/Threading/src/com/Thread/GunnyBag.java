package com.Thread;

public class GunnyBag {
	public boolean avail =true;
	int cont;
	
	
	public synchronized void put(int value){
		while(avail==true){
			try{
				wait();
			}catch(InterruptedException e){
				
			}
		}
		cont=value;
		avail=true;
		notifyAll();
	}
		public synchronized int get(){
			
			while(avail==false){
				try{
					wait();
				}catch(InterruptedException e){
					
				}
				
				
			}
			avail=false;
			notifyAll();
			return cont;
			
			
			
		}
		
		
		
	}
	
	
	


