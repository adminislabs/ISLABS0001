package com.learn.threads;

import java.io.EOFException;

public class Factory implements Runnable{
	
	Factory clothes;
	
	Factory(Factory clothesa){
		
		if(clothesa != null)
			
			clothes=clothesa;
		
		
	}
	
	public Factory(Clothing rishi) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++){
			synchronized (clothes){
				try{
					Thread.sleep(200);
					System.out.println("production of clothes" + "jeans" + i);
			       clothes.setclotheType("brand" + "jack and jones"+i);
			       
					}catch(InterruptedException e){
						
					}
				
			}
			
			
		}
		
		
		
		
	}

	private void setclotheType(String string) {
		// TODO Auto-generated method stub
		
	}
   
	
}
