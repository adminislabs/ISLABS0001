package connectingDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishingConnection {

	public static void main(String[] args) {
		try{
			//Class.forName("org.mariadb.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
			if(conn!=null){
				System.out.println("Connection Established");
			}
			else {
				System.out.println("NOt Established");
			}
			
		}catch(SQLException sq){
			sq.printStackTrace();
		}
	

	}

}
