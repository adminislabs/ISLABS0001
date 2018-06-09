package Database;

import java.io.*;
import java.sql.*;

public class StoreFile
{
	public static void main(String args[])
    {
    	
    	try
    	{
    		 Class.forName("org.mariadb.jdbc.Driver");
             // Setup the connection with the DB
             Connection connect = DriverManager.getConnection("jdbc:mariadb://localhost/hr?user=root&password=");
             PreparedStatement ps = connect.prepareStatement("insert into filetable values(?,?)");
             File file =new File("E://Book1.xlsx");
            
			FileReader fr = new FileReader(file);
             ps.setInt(1,101);
            
             ps.setCharacterStream(2, fr,(int)file.length());
             int i =ps.executeUpdate();
             
             System.out.println( i +"Records affected");
             
             connect.close();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }    
}
