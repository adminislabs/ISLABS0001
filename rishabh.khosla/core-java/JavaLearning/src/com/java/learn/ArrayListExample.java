package com.java.learn;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
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
	    //iterating types:
	    //advance for loop
	    for(Student rr:list){
	    	System.out.println(rr.name+" "+rr.age+" "+rr.salary);
	    }
	    //for loop
	  //  for(int i=0;i<list.size();i++)
	    //	System.out.println();
	    
	    //iterator
	    Iterator itr=list.iterator();
	    while(itr.hasNext()){
	    	Student st=(Student)itr.next();
	    	String name=st.name;
	    	char[] c=name.toCharArray();
	    	if(c[0]=='C'){
	    		
	    	}
	    	else{
	    		
	    	
	    	System.out.println(st.name+" "+st.age+" "+st.salary);
	    }
	    }
	    Collections.sort(list, new SortBySalary());
	    
	    for(Student rr:list){
	    	System.out.println(rr.name+" "+rr.age+" "+rr.salary);
	    }
	    
	    
	    
	}
}
