package connectingDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindEmployee {

	
	public static void main(String[] args)  {
		try{
			ResultSet rs=null;
			Connection con=DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
			Statement st=con.createStatement();
			String query="select * from employees where FIRST_NAME LIKE 'z%'";
			 rs=st.executeQuery(query);
			
			while(rs.next()){
				String lastname=rs.getString(3);
				System.out.println(lastname);
			}
			if(rs.getFetchSize()==0){
				throw new EmployeeEmailNotFoundException("exception");
			}
		}catch(SQLException sq){
			sq.printStackTrace();
		}
		catch(EmployeeEmailNotFoundException e){
			e.getMessage();
		}

	}

}
