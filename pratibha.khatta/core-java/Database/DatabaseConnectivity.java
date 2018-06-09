package com.gndu.training.project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectivity {

	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    
    public void getConnection(){
    	try{
    		 Class.forName("org.mariadb.jdbc.Driver");
             // Setup the connection with the DB
             connect = DriverManager.getConnection("jdbc:mariadb://localhost/gndudepartments?user=root&password=");
             System.out.println(connect.toString());
             
    	}catch(Exception ex){
    		ex.printStackTrace();
    	}
    	
    }
    
    public static void main(String[] args) {
    	DatabaseConnectivity dc = new DatabaseConnectivity();
    	dc.getConnection();
    }
	
}

