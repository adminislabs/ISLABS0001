package learn.Threads;

public class SynchronizedThread extends Thread {
   synchronized	public void run(){
		for(int i=1;i<=2;i++){
			System.out.println(i+"  ");
		}
		
	}
	public  static void main(String args[]){
		
		SynchronizedThread t1=new SynchronizedThread ();
		SynchronizedThread t2=new SynchronizedThread ();
		
		t1.setName("roshni");
		t2.setName("rishi");
		
		t1.start();
		t2.start();
		
	}
	
	

}
