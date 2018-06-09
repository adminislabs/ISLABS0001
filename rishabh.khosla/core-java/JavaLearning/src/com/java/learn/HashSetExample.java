package com.java.learn;
import java.util.*;



public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Student> rishi=new HashSet<Student>();
		Student s1=new Student("John", 22, 52200);
		Student s2=new Student("Amanda", 30, 51200);
		Student s3=new Student("Mary", 31, 59900);
		Student s4=new Student("Jonathan", 30,45500);
		Student s5=new Student("Ram", 23, 52300);
		Student s6=new Student("Mike", 32, 54500);
		Student s7=new Student("Cheng", 31, 51500);
		//adding objects in class
		rishi.add(s1);
		rishi.add(s2);
		rishi.add(s3);
		rishi.add(s4);
		rishi.add(s5);
		rishi.add(s6);
		rishi.add(s7);
		
		for(Student rr:rishi){
			System.out.println(rr.name +"  "+rr.age+"  "+rr.salary);
		}
		System.out.println("output after the remove of c name object ");
		//Collections.sort(rishi,new SortBySalary());
		
		Iterator itr=rishi.iterator();
		while(itr.hasNext()){
			Student st=(Student)itr.next();
			System.out.println(st.name +"  "+st.age+"  "+st.salary);
		}
		int Age =100;
		int Salary=0;
		Iterator ss=rishi.iterator();
		while(ss.hasNext()){
			Student s=(Student)ss.next();
				if(s.salary>Salary){
					Salary=s.salary;
					
				}
				if(s.age<Age){
					Age=s.age;
				}
			
			
			
		}
		Iterator yy=rishi.iterator();
		while (yy.hasNext()) {
			Student s=(Student)yy.next();
			String name=s.name;
			if(Salary==s.salary){
				System.out.println(s.name);
			}
			
		}
		
		
		
	}
	    
		
		
		
	}


