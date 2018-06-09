package com.rosh;

public class Cubbyhole {
	
	private int contents;
	private boolean avail=false;
	public synchronized int get() {
		while(avail==false) {
			try {
				wait();
			}catch(InterruptedException e) {
			}
		}
		avail=false;
		notify();
		return contents;
		
		}
	public synchronized void put (int val) {
		while(avail==true) {
			try {
				wait();
			}catch(InterruptedException e) {
			}
		}
		 contents=val;
		 avail=true;
		notifyAll();
			}
	
		
		
		
	}

