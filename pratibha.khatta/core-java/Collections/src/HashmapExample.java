import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class HashmapExample 
{
   public static void main(String args[])
   {
	   HashMap<Integer,String> hm =new HashMap<Integer,String>();
	   hm.put(100,"Amit");
	   hm.put(101,"Esha");
	   hm.put(102,"Reha");
	   for(Map.Entry<Integer,String> m:hm.entrySet())
	   {
		   System.out.println(m.getKey()+" "+m.getValue());    
	   }
	   Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
       
	   while(itr.hasNext())
       {
            Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() + 
                                ", Value = " + entry.getValue());
       }
	   hm.forEach((k,v) -> System.out.println("Key = "
               + k + ", Value = " + v));
   }

    }

