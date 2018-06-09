import java.util.*;
public class LinkedListExample
{
	public static void main(String args[])
	{
	 LinkedList<String> list=new LinkedList<String>();  
	   
	    list.add("First");  
	    list.add("Second");  
	    list.add("Third");  
	    for(String obj:list)
	    {
	    	System.out.println(obj);
	    }
	    
	    Iterator<String> iterator = list.iterator();
	    
	    while (iterator.hasNext())
	    {
	        System.out.println(iterator.next());
	    
	    }
	    for (int i = 0; i < list.size(); i++) // Using For Loop
	      {
	          System.out.println(list.get(i));
	      }
	}
}
