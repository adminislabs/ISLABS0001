import java.util.*;
public class List
{
  public static void main(String args[])
  {
	  ArrayList<String> list = new ArrayList<String>();
	  
      list.add("FIRST");

      list.add("SECOND");

      list.add("THIRD");

      list.add("FOURTH");

      list.add("FIFTH");
      
      for (int i = 0; i < list.size(); i++) // Using For Loop
      {
          System.out.println(list.get(i));
      }
      Iterator<String> it = list.iterator();
      
      while (it.hasNext())       // Using Iterator
      {
          System.out.println(it.next());

          it.remove(); //Removing an element from listit.remove
      }
      
      for (String element : list)
      {
          System.out.println(element);
      }
  }
  
}
