package com.rosh;

public class Producer extends Thread {
	private Cubbyhole cubbyhole;
	
	public Producer(Cubbyhole c) {
		cubbyhole=c;
		
	}
	
	public void run() {
		int val=0;
		for (int i=0;i<=8;i++);{
		val=cubbyhole.get();
		System.out.println("value"+val);
	}

}}
