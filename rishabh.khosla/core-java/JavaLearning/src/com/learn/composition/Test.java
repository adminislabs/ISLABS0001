package com.learn.composition;

public class Test {

	public static void main(String[] args) {
		Department d=new Department();
	//d.setDeptname("ss");
		System.out.println("the information of department regarding the person and job:");
         System.out.println("dept name" +d.getDeptname());
         System.out.println("deptStrength "+d.getDeptStrength());
         System.out.println("the person info:");
         
         System.out.println("height of person"+d.getPersonHeight());
         System.out.println("person weight :"+d.getPersonWeight());
         System.out.println("the job info");
         System.out.println("the job id:"+d.getid());
         System.out.println("the salary of person"+d.getSalary());
		
	}

}
