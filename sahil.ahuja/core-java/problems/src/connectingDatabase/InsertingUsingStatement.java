package connectingDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingUsingStatement {

	public static void main(String[] args) {
		try{
			ResultSet rs=null;
			Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
			Statement st=conn.createStatement();
			String query="insert into jobs values(33,'employe',10,20) ";
			 rs=st.executeQuery(query);
			 if(rs!=null){
				 System.out.println("Success");
			 }
			 else{
				 System.out.println("Failed");
			 }
			
		}catch(SQLException sq){
			sq.printStackTrace();
		}

	}

}
