package com.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo1 {
	
	public static void main(String[] args) {
		
		try {
			// first we are creating connection object, we have to add jar file  
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
			
			Statement statement = connection.createStatement();
			//String createQuery="create table student (id int , name varchar(15))";
			String insertQuery="insert into student values(100, 'akhila')";
			statement.execute(insertQuery);
			
			System.out.println("Done");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}

}
