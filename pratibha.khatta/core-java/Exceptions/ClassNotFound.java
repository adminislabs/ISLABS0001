package Exceptions;

public class ClassNotFound
{
    public static void main(String args[])
    {
    	try
    	{
    		Class.forName("Test.txt");
    	}
    	catch(ClassNotFoundException e)
    	{
    		System.out.println("Sorry class is not present");
    	}
    }
}
