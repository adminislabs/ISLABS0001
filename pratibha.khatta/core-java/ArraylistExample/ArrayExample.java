package ArraylistExample;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayExample 
{
@SuppressWarnings("unchecked")
    public static void main(String args[])
   {
     ArrayList<Student> list=new ArrayList<Student>();
     list.add(new Student("John",12,522));
     list.add(new Student("Anand",10,512));
     list.add(new Student("Anita",14,562));
     System.out.println("Unsorted");
     for (int i=0; i<list.size(); i++)
     
         System.out.println(list.get(i));

     Collections.sort(list, new Sortbyage());

     System.out.println("\nSorted by age");
     for (int i=0; i<list.size(); i++)
     
         System.out.println(list.get(i));

     
     
    }
 }

     
    
    