package com.learn.threads;

public class MozilaThread extends Thread {
	Synchronized r;
	public MozilaThread(Synchronized r){
		this.r=r;
		
	}
	public void run(){
		r.print(5);
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Synchronized obj=new Synchronized();
		
		CromeThread t1=new CromeThread(obj);
		MozilaThread t2=new MozilaThread(obj);
		
		t1.start();
		t2.start();
		t2.setPriority(MAX_PRIORITY);

	}

}
