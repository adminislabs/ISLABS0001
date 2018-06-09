package composition;

public class Job {

	String jobname;
	int salary;
	public Job(String jobname,int salary){
		this.jobname=jobname;
		this.salary=salary;
		return;
	}
	public String getJobName() {
		return jobname;
	}
	
	public int getSalary() {
		return salary;
	}
	

}
