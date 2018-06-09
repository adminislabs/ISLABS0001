
public class Check extends Thread {
public void run() {
	
	System.out.println("hiiii"+" "+Thread.currentThread());
}
	
	
	
	
	public static void main(String[] args) {
		
		Check c=new Check();
		Check c1=new Check();
		Check c4=new Check();
		Check c3=new Check();
		Check c5=new Check();
		c.start();
		c1.start();
		c4.start();
		c3.start();
		c5.start();
		
		
		

	}

}
