package database;

import java.sql.*;

public class DatabaseSetConnectionExample {

	public static void main(String[] args) {
		try{
			Class.forName("org.mariadb.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mariadb://localhost/gndudepartments?user=root&password=");
			if(con!=null){
				System.out.println("connection establishedd");
				}
			else
				System.out.println("not established");
			con.close();
		}
		catch(Exception sq){
			System.out.println(sq.getMessage());
		}

	}

}
