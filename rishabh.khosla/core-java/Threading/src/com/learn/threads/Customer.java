package com.learn.threads;

public class Customer implements Runnable {

	Customer clothes;
	Customer(Customer  clothesa){
		if(clothesa != null)
			clothes=clothesa;
		 
	}
	
	
	public Customer(Clothing rishi) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		synchronized(clothes){
			for(int i=0;i<5;i++){
				try{
					Thread.sleep(500);
					
					if(clothes.getclothesType()== null){
						System.out.println("no clothes available available");
						clothes.wait();
					}
					clothes.setclothesType(null);
					clothes.notify();
				}catch(InterruptedException e){
				}
				
				
			}
			
		}
		
		
		
		
	}


	private void setclothesType(Object object) {
		// TODO Auto-generated method stub
		
	}


	private Object getclothesType() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
