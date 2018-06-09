package Database;
import java.sql.*;
public class InsertData 
{
	public static void main(String args[])
    {
		
		  String Job_id ="3";
      	  String Job_Title="Enginerring";
      	  String Min_Salary ="3000";
      	  String Max_Salary ="6000";
      	  
      	try
    	{
    		 Class.forName("org.mariadb.jdbc.Driver");
             // Setup the connection with the DB
             Connection connect = DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
             Statement stmt = connect.createStatement();
             String q1="insert into Jobs values('" +Job_id+ "', '" +Job_Title+ 
                     "', '" +Min_Salary+ "','" +Max_Salary+"')";
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
