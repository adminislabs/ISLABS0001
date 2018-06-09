package database;

import java.sql.DriverManager;
import java.sql.*;

public class DatabaseUpdate {

	public static void main(String[] args) {
		try{
		Connection con =DriverManager.getConnection("jdbc:mariadb://localhost/gndudepartments?user=root&password=");
		Statement st=con.createStatement();
		String q2="UPDATE department set dept_name='civil' where id=2";
		ResultSet res=st.executeQuery(q2);
		if(q2!=null){
			System.out.println("Success");
		}
		else {
			System.out.println("Failed");
		}
		con.close();
		}
		catch(SQLException sq){
			System.out.println(sq.getMessage());
		}
	}

}
