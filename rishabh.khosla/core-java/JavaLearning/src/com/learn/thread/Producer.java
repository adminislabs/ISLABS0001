package com.learn.thread;

public class Producer extends Thread{
public Bukket hole;
int j=0;

Fibonacci f=new Fibonacci();
	public Producer(Bukket n){
	hole=n;
	}
	public void run(){
		for(int i=1;i<=5;i++){
			int value =f.generate(j);
			synchronized(hole){
				hole.put(value);
				j++;
				System.out.println("item produced "+value);
				
			}
			
		}
		
		
	}
	
	
}
