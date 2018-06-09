package Database;
import java.sql.*;

public class Update
{
	public static void main(String args[])
	{
		 try
			{
				 Class.forName("org.mariadb.jdbc.Driver");
		         // Setup the connection with the DB
		         Connection connect = DriverManager.getConnection("jdbc:mariadb://localhost/gndudepartments?user=root&password=");
		         Statement stmt = connect.createStatement();
		         String q1="update id set dept = '" + science + "'WHERE id =2'"
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
