package jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcMain {

	public static void main(String[] args) {

		try {
			Connection connection = getDbConnection();
			Statement statement = createStatement(connection);

			String query = displayDetails();
			statement.execute(query);
			System.out.println(" Operation success");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static String displayDetails() {
		System.out.println("0. SQL Table Creation Statement :");
		System.out.println("1. Alter table :");
		System.out.println("2. Rename table ");
		System.out.println("3. Truncate table ");
		System.out.println("4. Drop Table ");
		System.out.println("5. Insert Table ");
		System.out.println("6. Update Table ");
		System.out.println("7. Delete");

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your choice : ");
		int choice = scanner.nextInt();
		switch (choice) {
		case 0: {
			return createQuery(scanner);
		}case 1: {
			return alterQuery(scanner);
		}case 2: {
			return renameQuery(scanner);
		}case 3: {
			return truncateQuery(scanner);
		}case 4: {
			return  dropQuery(scanner);
		}case 5: {
			return insertQuery(scanner);
		}case 6: {
			return updateQuery(scanner);
		}
		case 7: {
			return deletQuery(scanner);
		}
		default:

			return "Invalid choice";
		}

	}

	private static String deletQuery(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String updateQuery(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String insertQuery(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String dropQuery(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String truncateQuery(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String renameQuery(Scanner scanner) {
		
		System.out.println("enter your table name");
		String name= scanner.next();
		System.out.println("enter name you want to change");
		String newname=scanner.next();
		
		String query="Rename table "+name+" to "+newname;
		return query;
	}

	private static String alterQuery(Scanner scanner) {
		// TODO Auto-generated method stub
		return null;
	}

	private static String createQuery(Scanner scanner) {
		System.out.println("Enter the table name");
		String tableName = scanner.next();

		System.out.println(" Enter the number of columns ");
		int columncount = scanner.nextInt();
		String columnname = "";
		String varchar = "VARCHAR(25)";
		StringBuilder sb = new StringBuilder("Create Table " + tableName + " (");
		for (int i = 1; i <= columncount; i++) {
			System.out.println("Enter column " + i + " name :");
			columnname = scanner.next();
			sb.append(columnname).append(" ").append(varchar);
			if (i < columncount) {
				sb.append(", ");
			}
		}
		sb.append(" );");

		System.out.println("sql table creation statement ");
		System.out.println(sb.toString());

		return sb.toString();
	}

	private static Statement createStatement(Connection connection) throws SQLException {
		System.out.println("connection Utilities get dbconnection invoked");
		System.out.println("Connection success");
		return connection.createStatement();
	}

	public static Connection getDbConnection() throws SQLException {
		return DriverManager.getConnection(Utilis.url, Utilis.username, Utilis.password);

	}

}
