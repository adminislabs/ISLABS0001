package learn.composition;



public class Department {
String branch;
int grade;
Person pp;
Job jj;
Company cc;
Department(){
	//acesss attributes of Person class 
	this.pp=new Person();
	pp.setId(1);
	pp.setName("roshni");
	pp.setAddress("amritsar");
	
	// acesss attributes of Job class
	
	this.jj=new Job();
	jj.setId(12);
	jj.setSalary(3000);
	
	//access attributes of company class
	this.cc=new Company();
	cc.setLocation("pune");
	cc.setNetworth(500000);
	
}
public void pp() {
	// TODO Auto-generated method stub
	System.out.println(pp.getId());
	System.out.println(pp.getAddress());
	System.out.println(pp.getName());
	
}	
	
}
