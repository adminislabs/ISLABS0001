package database;

import java.sql.*;

public class DatabaseInsertion {
	public static void main(String[] args){
		try{
			
		Connection con=DriverManager.getConnection("jdbc:mariadb://localhost/gndudepartments?user=root&password=");
		Statement st=con.createStatement();
		String q1="insert into department values (4,'sahil2','mec','free')";
		ResultSet rs=st.executeQuery(q1);
		if(q1!=null){
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
