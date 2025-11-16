package jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class prepareStmtdemo {
	public static void main(String[] args) throws SQLException {
		
		Connection connection= getconnection();
		//in runtime using scanner i have to insert values for prepare statement
	}

	private static Connection getconnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcpractice","root","root");
	}

}
