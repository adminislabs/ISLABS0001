package Database;
import java.sql.*;
public class Fetch 
{
    public static void main(String args[])
    {
    	
    	try
    	{
    		 Class.forName("org.mariadb.jdbc.Driver");
             // Setup the connection with the DB
             Connection connect = DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
             String query ="SELECT * from employee";
             Statement stmt= connect.createStatement();
            
              ResultSet rs = stmt.executeQuery(query);
              while(rs.next())
              {
            	  int Employee_id = rs.getInt("Employee_id");
            	  String firstname=rs.getString("First_Name");
            	  String lastname =rs.getString("Last_name");
            	  String Email =rs.getString("Email");
            	  String Phone_no = rs.getString("Phone_no");
            	  Date Hire_date = rs.getDate("Hire_date");
            	  String Job_id = rs.getString("Job_id");
            	  int Salary = rs.getInt("Salary");
            	  int Comission_PCT = rs.getInt("Comission_PCt");
            	  
            	  int Department_id = rs.getInt("Department_id");
            	  
            	  System.out.format("%d,%s,%s,%s,%s,%s,%s.%d,%d,%d",Employee_id,firstname,lastname,Email,Phone_no,Hire_date,Job_id,Salary,Comission_PCT,Department_id);
              }
             stmt.close();
    	}
    	
    	catch(Exception e)
    	 {
    		System.out.println(e);
    	 }
    	
    }
}
