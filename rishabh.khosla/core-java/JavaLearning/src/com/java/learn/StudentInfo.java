package com.java.learn;

public class StudentInfo implements Comparable<StudentInfo> {
	String name;
	int age;
	int salary;
	public StudentInfo(String name,int age,int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;}
	
		@Override
		public int compareTo(StudentInfo o) {
			
			int age = 0;
			if(age>o.age){
				return 1;
			}else if(age<o.age){
				return -1;
			}
			return 0;
		}

}
