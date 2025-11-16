package com.preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo1 {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
		
		//String create= "create table address(doornum int, name varchar(20))";
		
		String insertquery="Insert into address values(?,?)";
		
		String delete="delete from address where doornum=?";
		
		String update ="update address set doornum=?  where name=?";
		
		String select="select * from address";
		
		PreparedStatement psstatement = connection.prepareStatement(select);
		System.out.println("insert-------------------");
//		psstatement.setInt(1, 5);
//		psstatement.setString(2, "guntur");
//		int executeUpdate = psstatement.executeUpdate();
		System.out.println("insert-------------------");
		
		System.out.println("deleted-------------------");
//		psstatement.setInt(1, 4);
//		
//		int deletedrow = psstatement.executeUpdate();
//		System.out.println(deletedrow+" row deleted");
		System.out.println("deleted-------------------");
		
//		psstatement.setInt(1, 1);
//		psstatement.setString(2, "palvoncha");
//		psstatement.executeUpdate();
		
		ResultSet executeQuery = psstatement.executeQuery();
		while(executeQuery.next()) {
			System.out.println(executeQuery.getInt(1)+ " "+executeQuery.getString(2));
		}
		
	}
}
