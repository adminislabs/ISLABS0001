package Database;
import java.sql.*;

public class Insert 
{
    public static void main(String args[])
    {
    	 String id = "10";
         String name = "neha";
         String dept = "sales";
        
    
    try
	{
		 Class.forName("org.mariadb.jdbc.Driver");
         // Setup the connection with the DB
         Connection connect = DriverManager.getConnection("jdbc:mariadb://localhost/gndudepartments?user=root&password=");
         Statement stmt = connect.createStatement();
         String q1="insert into department values('" +id+ "', '" +name+ 
                 "', '" +dept+ "')";
         int x = stmt.executeUpdate(q1);
         if (x > 0)            
             System.out.println("Successfully Inserted");            
         else           
             System.out.println("Insert Failed");
          
         connect.close();
     }
	catch(Exception e)
	 {
		System.out.println(e);
	 }
 }
}
