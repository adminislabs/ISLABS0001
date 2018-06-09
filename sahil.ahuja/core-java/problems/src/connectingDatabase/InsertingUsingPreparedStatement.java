package connectingDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingUsingPreparedStatement {

	public static void main(String[] args) {
		try{
			Connection conn=DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
			Scanner sc=new Scanner(System.in);
			System.out.println("Insert values in jobs table of hr schema");
			System.out.println("Enter job_id");
			int job_id=sc.nextInt();
			System.out.println("Enter job title");
			String job_title=sc.next();
			System.out.println("Enter min salary");
			int min_salary=sc.nextInt();
			System.out.println("Enter max salary");
			int max_salary=sc.nextInt();
			PreparedStatement ps=conn.prepareStatement("insert into jobs values(?,?,?,?)");
			ps.setString(2, job_title);
			ps.setInt(1, job_id);
			ps.setInt(3, min_salary);
			ps.setInt(4, max_salary);
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
