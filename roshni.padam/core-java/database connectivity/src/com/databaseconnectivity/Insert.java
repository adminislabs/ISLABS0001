package com.databaseconnectivity;
import java.sql.*;

public class Insert {
public static void main(String args[]) {
	try {
		Connection con=DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
		PreparedStatement ps=con.prepareStatement("insert into jobs values(?,?,?,?)");
		
		ps.setInt(1, 23);
		ps.setString(2,"ee" );
		ps.setInt(3, 44);
		ps.setInt(4, 55);
		ResultSet rs=ps.executeQuery();
		if(rs!=null){
			System.out.println("Ur record inserted");
		}
		else{
			System.out.println("Not Inserted");
		}
	}catch(SQLException sq){
		sq.printStackTrace();
	}

}

		
		
	
	
	
	
	
	
	
}
	
	
	
	

