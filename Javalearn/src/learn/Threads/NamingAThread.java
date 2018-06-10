package learn.Threads;

public class NamingAThread extends Thread {

	public static void main(String[] args) {
		NamingAThread t1=new NamingAThread();
		NamingAThread t2=new NamingAThread();
		NamingAThread t3=new NamingAThread();
		NamingAThread t4=new NamingAThread();
		t1.setName("thread 1");
		t2.setName("thread 2");
		t3.setName("thread 3");
		t4.setName("thread 4");
	
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
		
		
		
   

	}

}
