package Exceptions;

public class Number 
{
   public static void main(String args[])
   {
	    String value="two";
	    int x=Integer.parseInt(value);
	    System.out.println(x*x);
	   
   
   try
   {
	   String value2="10";
	   int y =Integer.parseInt(value2);
	   System.out.println(y);
			   
   }
   catch(NumberFormatException e)
   {
	   System.err.println("Unable to format" +e);
   }
}
}
