package Exceptions;

public class Array
{
    public static void main(String args[])
    { 
    	try
   
       {
    
    	String [] value={"J","A","V","A"};
    	System.out.println("StringLength" +value.length);
    	String firstLetter=value[0];
    	String secondLetter=value[1];
    	String thirdLetter=value[2];
    	String fourthLetter=value[3];
    	String fifthLetter=value[4]; //Will throw ArrayIndexOutOfBoundException
    	System.out.println(firstLetter +secondLetter + thirdLetter + fourthLetter + fifthLetter);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {
       	 System.out.println(e);
      }
    }
}
