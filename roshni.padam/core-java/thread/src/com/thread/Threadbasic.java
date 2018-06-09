package com.thread;

public class Threadbasic extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			
				System.out.println(i);
			}
			
		}
		
		
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadbasic ti=new Threadbasic();
		Threadbasic t2=new Threadbasic();
		Threadbasic t3=new Threadbasic();
		
		ti.start();
		try {
			ti.join();
		}catch(Exception e){System.out.println(e);}
		
		
		
		
		t2.start();
		t3.start();
		
		
		
		

	}

}
