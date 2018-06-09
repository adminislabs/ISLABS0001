package com.java.learn;
import java.util.*;
public class TreeSetExample  {

	public static void main(String[] args) {
		TreeSet<Student> set= new TreeSet<Student>();
		Student r1=new Student("John", 22, 52200);
		Student r2=new Student("Amanda", 30, 51200);
		Student r3=new Student("Mary", 31, 59900);
		Student r4=new Student("Jonathan", 30,45500);
		Student r5=new Student("Ram", 23, 52300);
		Student r6=new Student("Mike", 32, 54500);
		Student r7=new Student("Cheng", 31, 51500);
		set.add(r1);
		set.add(r2);
		set.add(r3);
		set.add(r4);
		set.add(r5);
		set.add(r6);
		set.add(r7);
		Iterator itr=set.iterator();
		while(itr.hasNext()){
			Student rr=(Student)itr.next();
		
			System.out.println(rr.name+" "+rr.age+" "+rr.salary);
			
		}
		Iterator rr = set.iterator();
		int age = 100;
		int salary = 0;
		while (rr.hasNext()) {
			Student s = (Student) rr.next();
			if (s.salary > salary) {
				salary = s.salary;
			}
			if (s.age < age) {
				age = s.age;
			}
		}
		Iterator rr1 = set.iterator();
		TreeSet<Student> temp = null;
		while (rr1.hasNext()) {
			Student s = (Student) rr1.next();
			String name = s.name;
			char[] c = name.toCharArray();
			if (salary == s.salary) {
				System.out.println("Removing employee with max salary " + s.name + 
						 s.salary);

			} else if (age == s.age) {
				System.out.println("Removed youngest employee " + s.name + " and age is " + s.age
						+ " salary " + s.salary);

			}

			else if (c[0] == 'c') {
				System.out.println("Removed employee name starts from c" + s.name + " and age " + s.salary);

			} else {
				temp.add(s);
			}
		}
		Iterator rr3 = temp.iterator();
		while (rr3.hasNext()) {
			Student sss = (Student) rr3.next();
			System.out.println( sss.age + sss.name + sss.salary);
		}
		
		
		
		
		
			
		}

	
	
	}
		
		
		
		
		
	


