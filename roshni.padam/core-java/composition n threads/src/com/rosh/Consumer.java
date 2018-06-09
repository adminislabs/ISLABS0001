package com.rosh;

public class Consumer extends Thread {
	private Cubbyhole cubbyHole;
	public Consumer(Cubbyhole c) {
cubbyHole=c;
	}
	
	public void run() {
	for(int i=0;i<=8;i++) {
	cubbyHole.put(i);
	System.out.println("PUTTT"+i);
	
	}
	}
	
}