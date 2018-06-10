package learn.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCode {

	public static void main(String[] args) {
		
			ArrayList<Student>list=new ArrayList<Student>();
			Student s1= new Student("john",12,522);
			Student s2= new Student("amanda",10,520);
			Student s3= new Student("mary",11,548);
			Student s4= new Student("jonathan",10,523);
			Student s5= new Student("ram",13,512);
			Student s6= new Student("mike",12,545);
			Student s7= new Student("cheng",11,511);
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			list.add(s5);
			list.add(s6);
			list.add(s7);
			
		//traversing list by advanced for loop method
		for(Student roshni:list) {
			System.out.println(roshni.name+" "+roshni.age+" "+roshni.salary);
			
		}
		System.out.println("sorting of collections by age ");
		Collections.sort(list, new SortByAge());
		
		for(Student roshni:list) {
			System.out.println(roshni.name+" "+roshni.age+" "+roshni.salary);
				

	}

	}}


