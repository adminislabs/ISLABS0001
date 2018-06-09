package arraylist;

import java.util.*;

public class Arraylistexample {
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		System.out.println(al);
		Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			String s=(String)it.next();
			if(s.equals("three"))
			it.remove();
			else
				System.out.println(s);
		}
	    ListIterator lit=al.listIterator();
	    while(lit.hasNext())
	    {
	    	String s=(String)lit.next();
	    	if(s.equals("one"))
	    		lit.set("1");
	    	else if(s.equals("four"))
	    		lit.add("five");
	    	
	    		//System.out.println(s);
	    }
		System.out.println(al);
		
	}

}
