package com.preparestatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class demo2 {

	public static void main(String[] args) throws SQLException {
		Connection connection = getconnection();

//		 String create= "create table abc(id int, name varchar(20))";
//		 PreparedStatement psstatement = connection.prepareStatement(create);
//		 psstatement.execute();
		//insert(connection);
	//	select(connection);
		//update(connection);
		deleted(connection);
		 System.out.println("executed");

		
	}

	private static void select(Connection connection) throws SQLException {
		String select = "select * from abc where id=?";
		PreparedStatement psstatement = connection.prepareStatement(select);
		psstatement.setInt(1, 1);
		ResultSet executeQuery = psstatement.executeQuery();
		while (executeQuery.next()) {
			System.out.println(executeQuery.getInt(1) + " " + executeQuery.getString(2));
		}
	}

	private static void update(Connection connection) throws SQLException {
		String update = "update abc set id=?  where name=?";
		PreparedStatement psstatement = connection.prepareStatement(update);
		psstatement.setInt(1, 1);
		psstatement.setString(2, "pinky");
		int executeUpdate = psstatement.executeUpdate();
		System.out.println("row " + executeUpdate);
	}

	private static void deleted(Connection connection) throws SQLException {
		String delete = "delete from abc where id=?";
		PreparedStatement psstatement = connection.prepareStatement(delete);
		psstatement.setInt(1, 4);
		int deletedrow = psstatement.executeUpdate();
		System.out.println("row " + deletedrow);
	}

	private static void insert(Connection connection) throws SQLException {
		String insertquery = "Insert into abc values(?,?)";
		PreparedStatement psstatement = connection.prepareStatement(insertquery);
		psstatement.setInt(1, 4);
		psstatement.setString(2, "sammu");

		int executeUpdate = psstatement.executeUpdate();
		System.out.println("row " + executeUpdate);
	}

	private static Connection getconnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice", "root", "root");
	}
}
