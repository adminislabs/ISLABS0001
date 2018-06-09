package com.databaseconnectivity;
import java.sql.*;

public class Mariadb {





    public static void main(String args[])
    {
        try
        {
            //Class.forName("org.mariadb.jdbc.Driver");
             
            // Establishing Connection
            Connection con = DriverManager.getConnection(
             "jdbc:mariadb://localhost/hr?user=root&password=");
 
            if (con != null)             
                System.out.println("Connected");            
            else           
                System.out.println("Not Connected");
             String query = "SELECT * From employees";
             		Statement st =con.createStatement();
             		ResultSet rs= st.executeQuery(query);
             		while (rs.next())
             			
{
             			int Employeeid =rs.getInt("EMPLOYEE_ID");
             			
             			String firstname=rs.getString("FIRST_NAME");
             			
             			String lastname=rs.getString("LAST_NAME");
             			String mail=rs.getString("EMAIL");
             			String phone=rs.getString("PHONE_NUMBER");
             	
             			int jobid=rs.getInt("JOB_ID");
             			int slary=rs.getInt("SALARY");
             			int pct=rs.getInt("COMMISSION_PCT");
             			int managerid=rs.getInt("MANAGER_ID");
             			int departmentid=rs.getInt("DEPARTMENT_ID");
             			System.out.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s\n",Employeeid,firstname,lastname,mail,phone,jobid,slary,pct,managerid,departmentid);

             			
}
             			
            st.close(); 			
             			
            
             			

             		
         
        }
        catch(SQLException e)
        {
           e.printStackTrace();
        }
    }
}