import java.util.Collections;
import java.util.Iterator;
import java.util.HashSet;
@SuppressWarnings("unused")
public class HashSetExample extends Students
{
 public HashSetExample(String name, int age, int totalMarks) {
		super(name, age, totalMarks);
		// TODO Auto-generated constructor stub
	}

@SuppressWarnings("unchecked")
public static void main(String args[])
 {
	    @SuppressWarnings("rawtypes")
		HashSet set = new HashSet();
	    Students s1 = new Students("john", 12, 522);
	    Students s2 = new Students("amanda", 10, 512);
		Students s3 = new Students("mary", 11, 599);
		Students s4 = new Students("johnathan", 10, 455);
		Students s5 = new Students("ram", 13, 523);
		Students s6 = new Students("mike", 12, 545);
		Students s7 = new Students("cheng", 11, 515);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		Iterator<String> itr=set.iterator();
		int age=100;
		int totalmarks=0;
		while(itr.hasNext())
		{
			Students std=(Students)itr.next();
			String name=std.name;
			char[] c=name.toCharArray();
			if(totalmarks==std.totalMarks)
			{
				System.out.println("Remove employee with maximum marks whose name is "+std.name+" and marks are "+std.totalMarks);
			   
			}
			else if(age==std.age){
				System.out.println("Remove youngest employee whose name is "+std.name+" and age is "+std.age+" and totalmarks "+std.totalMarks);
	           		
			}
			
			else if(c[0]=='c')
			{
			System.out.println("Remove employee whose name was "+std.name+" and age "+std.age);	
			itr.remove();
			}
		}
    }
 }



