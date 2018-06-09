package com.java.learn;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		Vector<Student> list=new Vector<Student>();
		Student s1=new Student("John", 22, 52200);
		Student s2=new Student("Amanda", 30, 51200);
		Student s3=new Student("Mary", 31, 59900);
		Student s4=new Student("Jonathan", 30,45500);
		Student s5=new Student("Ram", 23, 52300);
		Student s6=new Student("Mike", 32, 54500);
		Student s7=new Student("Cheng", 31, 51500);
		list.add(s1);
		list.add(s2);	
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		for(Student o:list)
			System.out.println(o.name+" "+o.age+" "+o.salary);
		

		
	}

}
