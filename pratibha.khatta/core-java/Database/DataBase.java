package Database;
import java.sql.*;
public class DataBase
{
	public static void main(String args[])
	{
	    
	    	try
	    	{
	    		 Class.forName("org.mariadb.jdbc.Driver");
	             // Setup the connection with the DB
	             Connection connect = DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
	             if (connect != null)             
	                 System.out.println("Connected");            
	             else           
	                 System.out.println("Not Connected");
	              
	         }
	    	catch(Exception e)
	    	 {
	    		System.out.println(e);
	    	 }
	    	
	    }
	}

