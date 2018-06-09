package com.java.learn;
import java.util.*;
public class HashMapExample {

	public static void main(String[] args) {
	HashMap<Integer,Student> map=new HashMap<Integer,Student>();
	Student s1=new Student("John", 22, 52200);
	Student s2=new Student("Amanda", 30, 51200);
	Student s3=new Student("Mary", 31, 59900);
	Student s4=new Student("Jonathan", 30,45500);
	Student s5=new Student("Ram", 23, 52300);
	Student s6=new Student("Mike", 32, 54500);
	Student s7=new Student("Cheng", 31, 51500);
	map.put(1,s1);
	map.put(2,s2);
	map.put(3,s3);
	map.put(4,s4);
	map.put(5,s5);
	map.put(6,s6);
	map.put(7,s7);
	//traverse hashmap
	for(Map.Entry<Integer, Student> entry:map.entrySet()){    
        int key=entry.getKey();  
        Student  b=entry.getValue();  
        System.out.println(key+" Details:");  
	    System.out.println(b.name+" "+b.age+" "+b.salary);
	
	    
	    
	    
	    
	
	
	
	}
	
	}

}
