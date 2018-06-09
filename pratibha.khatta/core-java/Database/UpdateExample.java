package Database;
import java.sql.*;
public class UpdateExample
{
      public static void main(String args[])
      {
    	  try
      	{
      		 Class.forName("org.mariadb.jdbc.Driver");
               // Setup the connection with the DB
               Connection connect = DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
               PreparedStatement stmt=connect.prepareStatement("update Jobs set Job_title=? where Job_id=?");  
               stmt.setString(3,"Doctor");
               int i=stmt.executeUpdate();  
               System.out.println(i+" records updated");  
               connect.close();
      	}
    	  catch(Exception e)
    	  
    	  {
    		  System.out.println(e);
    	  }
      }
}
