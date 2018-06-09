import java.util.*;
import java.util.Comparator;
public class ArrayList 
{
	
		public static void main(String args[])
		{
			ArrayList<Student> list =new ArrayList<Student>();
			Student s1=new Student("John",12,522);
			Student s2=new Student("Amanda",10,512);
			Student s3=new Student("Mary",10,599);
			Student s4=new Student("Jonathan",10,455);
			Student s5=new Student("Ram",13,523);
			Student s6=new Student("Mike",12,545);
			Student s7=new Student("Chang",11,515);
		
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			list.add(s5);
			list.add(s6);
			list.add(s7);
	        for(Student ss: list)
	        { 
				System.out.println(ss.name +"" +ss.age +"" +ss.total_marks);
			}
	        list.sort( new ByAge());
	        System.out.println();
	        System.out.println("List is present in ascending orderby age");
	        for(Student ss : list){
	        System.out.println(ss.name +"" +ss.age +"" +ss.total_marks);
	        }
	        

}
