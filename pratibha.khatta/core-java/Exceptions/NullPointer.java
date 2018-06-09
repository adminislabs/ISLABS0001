package Exceptions;
import java.util.Hashtable;
public class NullPointer 
{
    public static void main(String args[])
    {
    	 Hashtable<Integer,String> h1=new Hashtable<>();
    	 h1.put(null,"Sir");
    }
}
