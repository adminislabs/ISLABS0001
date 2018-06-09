package database;

//import java.sql.Connection;
import java.sql.*;

public class DatabaseIteration {

	public static void main(String[] args) {
		try{
		Connection con=DriverManager.getConnection("jdbc:mariadb://localhost/gndudepartments?user=root&password=");
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery("select * from department");
		System.out.println("id  name  dept_name  description");
		while(rs.next()){
			System.out.println(rs.getInt("id")+"  "+rs.getString("name")+"  "+rs.getString("dept_name")+"          "+rs.getString("description"));
		}
		con.close();
		}
		catch(SQLException sq){
			System.out.println(sq.getMessage());
		}

	}

}
