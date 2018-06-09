package com.pcticesra;

public class Persons {
	Data d;
	int data;
	Persons(int data ,Data d ){
		this.data=data;
		this.d=d;
		
		
	}
	void print() {
		System.out.println(data);
		System.out.println(d.id);
		System.out.println(d.rollno);
	}
	
	
}
