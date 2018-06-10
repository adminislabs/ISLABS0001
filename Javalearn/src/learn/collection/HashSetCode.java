package learn.collection;

import java.util.HashSet;

public class HashSetCode {

	public static void main(String[] args) {
		HashSet<Student> set=new HashSet<Student>();
		Student s1=new Student("John", 22, 52200);
		Student s2=new Student("Amanda", 30, 51200);
		Student s3=new Student("Mary", 31, 59900);
		Student s4=new Student("Jonathan", 30,45500);
		Student s5=new Student("Ram", 23, 52300);
		Student s6=new Student("Mike", 32, 54500);
		Student s7=new Student("Cheng", 31, 51500);
		//adding objects in class
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s6);
		set.add(s7);
		
		for(Student rr:set){
			System.out.println(rr.name +"  "+rr.age+"  "+rr.salary);
		}
	}

}
