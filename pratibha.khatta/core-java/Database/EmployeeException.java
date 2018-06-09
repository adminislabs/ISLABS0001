package Database;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class EmployeeException 
{

	@SuppressWarnings("unused")
	public static void main(String args[]) throws Exception
	{
	
	      
				Class.forName("org.mariadb.jdbc.Driver");
				
	             // Setup the connection with the DB
	             Connection connect = DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
	             String query ="SELECT * from employee where First_Name LIKE 'Z%' ";
	             Statement stmt= connect.createStatement();
	            
	              ResultSet rs = stmt.executeQuery(query);
	            if(query!=null)
	             {
	              while(rs.next())
	              {
	            	  int Employee_id = rs.getInt("Employee_id");
	            	  String firstname=rs.getString("First_Name");
	            	  String lastname =rs.getString("Last_name");
	            	  System.out.format("%d,%s,%s",Employee_id , firstname,lastname);
	              
	              }
	             
	              
	             }
	          //  connect.close();
					throw new EmployeeNotFoundException();
	          
	             
	}
}
	    	
	    

