package com.pcticesra;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		Student1 sa=new Student1(23,"rohit");
		Student1 sb=new Student1(24,"roshni");
		ArrayList<Student1>list=new ArrayList<Student1>();
	list.add(sa);
	list.add(sb);
	for (Student1 vb: list) {
		System.out.println(vb.name);
		System.out.println(vb.rollno);
	}
		
		
		
	}

}
