package studentsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


public class StudentHashSetExample {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		HashSet temp=new HashSet();
		Student s1 = new Student("john", 12, 522);
		Student s2 = new Student("amanda", 10, 512);
		Student s3 = new Student("mary", 11, 599);
		Student s4 = new Student("johnathan", 10, 455);
		Student s5 = new Student("ram", 13, 523);
		Student s6 = new Student("mike", 12, 545);
		Student s7 = new Student("cheng", 11, 515);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		hs.add(s6);
		hs.add(s7);
		
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			Student d=(Student)it.next();
			System.out.println(d.age);
		}
		Iterator lt=hs.iterator();
		
		int age=100;
		int totalmarks=0;
		while(it.hasNext()){
			Student s=(Student)it.next();
			if(s.totalMarks>totalmarks){
				totalmarks=s.totalMarks;
			}
			if(s.age<age){
				age=s.age;
			}
		}
		
		while(lt.hasNext()){
			Student s=(Student)lt.next();
			String name=s.name;
			char[] c=name.toCharArray();
			if(totalmarks==s.totalMarks){
				System.out.println("Removing employee with maimum marks whose name is "+s.name+" and marks are "+s.totalMarks);
			    //lt.remove();
			}
			else if(age==s.age){
				System.out.println("Removed youngest employee whose name is "+s.name+" and age is "+s.age+" and totalmarks "+s.totalMarks);
	            //lt.remove();		
			}
			
			else if(c[0]=='c'){
			System.out.println("Removed employee whose name was "+s.name+" and age "+s.age);	
			lt.remove();
			}
			else{
				temp.add(s);
			}
			}
		Iterator kt=temp.iterator();
		while(kt.hasNext()){
			Student st = (Student) kt.next();
			System.out.println("age " + st.age + " name " + st.name + " totalmarks " + st.totalMarks);
		}
			
			
		}
		
		

	

}
