package com.learn.hascode;
import java.util.*;
import java.util.Comparator;

public class Execute {
	
	
 public static void main(String args[]){

	 ArrayList<Student> list=new ArrayList<Student>();
	 Student s1=new Student("john",12,522);
	 Student s2=new Student("amanda",10,512);
	 Student s3=new Student("mary",11,599);
	 Student s4=new Student("jonathan",10,455);
	 Student s5=new Student("ram",13,523);
	 Student s6=new Student("mike",12,545);
	 Student s7=new Student("cheng",11,515);
	 list.add(s1);
	 list.add(s2);
	 list.add(s3);
	 list.add(s4);
	 list.add(s5);
	 list.add(s6);
	 list.add(s7);
	 for(Student ss:list){
		 System.out.println(ss.name+" "+ss.age+" "+ss.total_marks);
	 }
	
	list.sort( new SortByAge());
	System.out.println();
	System.out.println("the list sort inacending order by age:");
	for(Student ss:list)

	 System.out.println(ss.name+" "+ss.age+" "+ss.total_marks);

}


}
