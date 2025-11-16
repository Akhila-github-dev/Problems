package com.statement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class demo2 {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection= getconnection();
		Statement statement = connection.createStatement();
		
//  	String createQuery="Create table emp (id int, name varchar(20), salary varchar(20))";
//		statement.execute(createQuery);
//		System.out.println("table created");
		
//		String insert="insert into emp(id,name,salary) values (5,'keerthi','5000')";
//		int row = statement.executeUpdate(insert);
//		System.out.println(row+" row got inserted");
		
//		String delete="delete from emp where id='5' ";
//		int row = statement.executeUpdate(delete);
//		System.out.println(row+" row got deleted");
//		
		ResultSet executeQuery = statement.executeQuery("select * from emp");
		
		ResultSetMetaData metaData = executeQuery.getMetaData();
		 int columnCount = metaData.getColumnCount();
		 System.out.println(columnCount);
		for(int i=1;i<=columnCount;i++) {
			System.out.println(i+" column name is "+metaData.getColumnName(i));
		}
		System.out.println();
		System.out.println(metaData.getColumnName(1)+"\t"+ metaData.getColumnName(2)+"\t"+ metaData.getColumnName(3));
		System.out.println("---------------------------------------");
		while(executeQuery.next()) {
			System.out.println(executeQuery.getString(1)+ " "+ executeQuery.getString(2)+ " "+ executeQuery.getString(3));
		}
		
		
	}

	private static Connection getconnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
	}

}
