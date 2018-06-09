package com.java.learn;

public class Student implements Comparable {
	String name;
	int age;
	int salary;
	public Student(String name,int age,int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
		
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
