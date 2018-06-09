import java.util.*;
import java.util.Iterator;
public class TreeExample
{
   public static void main(String args[])
   {
	   TreeSet <Integer> tree = new TreeSet<Integer>();

	      // adding in the tree set
	      tree.add(1);
	      tree.add(13);
	      tree.add(17);
	      tree.add(2);

	      // create ascending iterator
	      Iterator iterator;
	      iterator = tree.iterator();

	      // displaying the Tree set data
	      System.out.println("Tree set data in ascending order: ");     
	      while (iterator.hasNext()) {
	         System.out.println(iterator.next() + " ");
	      }
	   }     

   }

