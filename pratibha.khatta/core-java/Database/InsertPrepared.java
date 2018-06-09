package Database;
import java.sql.*;
public class InsertPrepared 
{
	public static void main(String args[]){  
		try{  
		Class.forName("org.mariadb.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");  
		  
		PreparedStatement stmt=con.prepareStatement("insert into Employee(Employee_id,First_Name,Last_Name,Email,Phone_no,Hire_date,Job_id,Salary,Comiison_PCT,Manager_id,Department_id )"
        + "  values (?, ?, ?, ?, ?, ?, ?,?, ?, ?, ?)";

        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString (1, "Barney");
        preparedStmt.setString (2, "Rubble");
        preparedStmt.setDate   (3, startDate);
        preparedStmt.setBoolean(4, false);
        preparedStmt.setInt    (5, 5000);

        // execute the preparedstatement
        preparedStmt.execute();
        
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
		}  
}
