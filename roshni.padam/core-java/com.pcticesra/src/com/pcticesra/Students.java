package com.pcticesra;

public class Students {
	
	static String name;
	static String city;
	static int id;
	static int age;
	
  Students(){
	  System.out.println("rosnii ");
	  System.out.println("rohit");
	  System.out.println("rishi");	
}
  Students(int a,int b, String city, String name){
	  age=a;
	  id=b;
	  this.city=city;
	  this.name=name;
	 
  }
  
 
  
  public static void main(String args[]) {
	  Students s=new Students(2,3,"aAmrmisar","rosni");
	  
	  System.out.println(id+" "+name+" "+ age+" "+city);
	  Students s1=new Students(32,43,"jalandhr","ROSH");
	  System.out.println(id+" "+name+""+city+"");
	  
	  
  }
	
}