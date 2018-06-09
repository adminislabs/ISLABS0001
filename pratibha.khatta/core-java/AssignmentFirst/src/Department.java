
public class Department 
{
	    int deptid;
	     String deptname;
	     private Job job;
	     private Person person;
	 	public Department(){
	 		this.person=new Person();
	 		person.setName("Neha");
	 		person.setId(1);
	 		this.deptid=10;
	 		this.deptname="Enginerring";
	 		
	 		this.job=new Job();
	 		job.setRole("Manger");
			job.setSalary(2000);
			job.setlocation("Delhi");
	 	}
	}


