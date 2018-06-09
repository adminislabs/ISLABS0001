package arraylist;

import java.util.*;

public class Linkedlistexample {
	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		ll.addFirst("one");
		
		ll.add(1,"two");
		ll.add(2,"three");
		ll.add(3,"four");
		ll.addLast("five");
		ll.removeLast();
		System.out.println(ll.getLast());
		System.out.println(ll);
		
		
	}

}
