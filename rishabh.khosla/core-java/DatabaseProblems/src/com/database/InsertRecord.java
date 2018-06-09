package com.database;
import java.sql.*;

public class InsertRecord {

	public static void main(String[] args) {
	
		
		try {
			Connection con=DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
			PreparedStatement ps=con.prepareStatement("insert into jobs values(?,?,?,?)");
			
			ps.setInt(1, 121);
			ps.setString(2,"rishab" );
			ps.setInt(3, 50);
			ps.setInt(4, 80);
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
