package Exceptions;

public class NullException
{
	public static void mian(String args[])
	{
		String s=null;
		try
		{
			if("hello".equals(s))
			{
				System.out.println("Strings are same");
			}
			else
			{
				System.out.println("Strings are not same");
			}
		}
		catch(NullPointerException e)
		{
			System.out.print("NullPointerException");
		}
	}
	

}
