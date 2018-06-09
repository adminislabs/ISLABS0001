
public class Company
{
	    String companyname;
	     Department dept;
	     Person person;
	     public String getCompany()
	     {
	    	 return companyname;
	     }
	     public void setCompany(String companyname)
	     {
	    	 this.companyname=companyname;
	     }
	     public Department getDept()
	     {
	    	 return dept;
	     }
	     public void setDept(Department dept)
	     {
	    	 this.dept=dept;
	     }
	     public Person getPerson()
	     {
	    	 return person;
	     }
	     public void setPerson(Person person)
	     {
	    	 this.person=person;
	     }
	     public Company()
	     {
	    	 this.companyname="ABC";
	     }
	    
	}


