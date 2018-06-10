package learn.acessmodifiers;

public class Private {
	 
		private int data=40;  
		private void msg(){System.out.println("Hello java");}  
		}  
		  //


// wont access private variable and method in class Simple 
// compile time error comes
// so make it access in simple class 
//apply getter and setter
		public  class Simple{  
		 public void main(String args[]){  
		   Private obj=new Private ();  
		   System.out.println(obj.data);  
		   obj.msg();
		}  
}
