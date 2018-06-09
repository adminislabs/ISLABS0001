package com.learn.threads;

public class Producer extends Thread{
private CubbyHole cubbyhole;

public Producer(CubbyHole c){
cubbyhole=c;	
}
	
	public void run(){
		int value=0;
		for(int i= 0;i<=8;i++){
			value=cubbyhole.get();
			System.out.println("got value"+value);
		}
		
		
		
	}
	
	
	
}

