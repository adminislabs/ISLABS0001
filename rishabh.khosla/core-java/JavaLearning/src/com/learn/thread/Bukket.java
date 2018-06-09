package com.learn.thread;

public class Bukket {
public	boolean cont=true;
int value;


	public synchronized void put(int n3){
		while(cont==true){
			try{
				wait();
			}catch(InterruptedException e){
				
			}
			
		}
		value=n3;
		cont=true;
		notifyAll();
		
	}
	
	public synchronized int get(){
		while(cont==false){
			try{
				wait();
			}catch(InterruptedException e){
				
			}
		
		}
		cont=false;
		notifyAll();
		return value;
		
		}
	

}
