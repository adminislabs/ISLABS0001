/**
 * 
 */
package com.learn.threads;

/**
 * @author rishi
 *
 */
public class Synchronized {
	synchronized void print(int number){
		for(int loop=1;loop<=5;loop++){
			System.out.println(loop*number);
			try{
				Thread.sleep(800);
				
			}
			catch(Exception e){
				
			}
		}
		
	}
	

}
