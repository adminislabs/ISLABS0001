package learn.exceptionhandling;

public class ThrowsException {

	
	public 	void  number(int age)
	{
			
			if(age<18)
			throw new	ArithmeticException("notvalid");
			else
				System.out.println("vote");
				
		}

		public static void main(String[] args) {
			
			ThrowsException roshni=new ThrowsException();
		roshni.number(5);
			
	
		}

	}


