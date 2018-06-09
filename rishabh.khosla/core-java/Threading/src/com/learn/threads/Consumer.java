package com.learn.threads;

public class Consumer extends Thread {
 private CubbyHole cubbyhole;
 public Consumer(CubbyHole c){
	 cubbyhole=c;
 }
	 public void run(){
		 
		 for(int i=0;i<=8;i++){
			 cubbyhole.put(i);
			 System.out.println("put"+i);
			 
		 }
	 }
	 
 }
	
	

