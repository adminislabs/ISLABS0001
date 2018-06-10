package learn.exceptionhandling;

public class IOException {
	
	
	void add(int a) throws Exception {
		if(a>20){
			
			throw new Exception("hi am exception");
			
		}
		System.out.println("not exception");
		

	}
	
	public static void main(String args[]) throws Exception{
		IOException e=new IOException();
		e.add(25);
		
	}
	
}
