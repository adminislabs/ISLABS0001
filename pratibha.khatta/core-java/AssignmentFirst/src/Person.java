
public class Person 
{
	
		private String name;
		private int id;
		Job job;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		
		Person()
		{
			this.job =new Job();
			job.setRole("Manger");
			job.setSalary(2000);
			job.setlocation("Delhi");
		}
		
}
