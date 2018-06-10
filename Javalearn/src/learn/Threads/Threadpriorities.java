package learn.Threads;

public class Threadpriorities extends Thread {
	
	public void run(){
		System.out.println("i am running"+" "+getName());
		
	}
	public static void main(String args[]){
		
		Threadpriorities t1=new Threadpriorities();
		Threadpriorities t2=new Threadpriorities();
		Threadpriorities t3=new Threadpriorities();
		//nameing a thread
		t1.setName("thread a");
		t2.setName("thread b");
		t3.setName("thread c");
		
		// set priority
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		//start thread
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	

}
