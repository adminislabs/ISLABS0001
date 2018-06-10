package learn.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleArrayListExample {

	public static void main(String[] args) {
   ArrayList<String> list=new ArrayList<String>();
   list.add("tom");
   list.add("merry");
   list.add("peter");
   list.add("john");
//traversing list through different methods 
   //classic for loop 
   for(int i=0;i<list.size();i++)
   {
	   String name=list.get(i);
	   System.out.println("traversing list using old for loop:"+" "+name);
	
   }
   // advanced for loop
   for(String ll:list){
	   System.out.println("advanced for loop:"+" "+ ll);
   }
   
   //iterator method
   Iterator<String> iterator = list.iterator();
   
   while (iterator.hasNext()) {
       String Namee = iterator.next();
       System.out.print("traverse through iterator ");
       System.out.println(Namee);
   }
   //while loop

   
	}

}
