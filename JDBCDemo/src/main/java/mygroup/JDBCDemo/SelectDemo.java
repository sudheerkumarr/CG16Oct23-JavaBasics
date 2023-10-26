package mygroup.JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1:
				// Load and register driver
				Class.forName("org.postgresql.Driver");
				System.out.println("Loaded driver successfully!");
				
				// Step2:
				// Create connection to the database
				Connection connection 
					= DriverManager.getConnection("jdbc:postgresql://localhost:5432/mydb", "postgres", "passwd");
				System.out.println("Created connection to the db sucessfully!");
				
				// Step3:
				// Create statement obj
				Statement stmt = connection.createStatement();
				System.out.println("Created statement object!");
				
				// Step 4:
				// execute query - insert record in the table
				
				ResultSet resultSet = stmt.executeQuery("select * from customer");
				System.out.println("Executed selct query successfully!");
				
				// Step 5: 
				// Display response
				while(resultSet.next()) {
					System.out.print(resultSet.getInt(1)+" | ");
					System.out.print(resultSet.getString(2)+" | ");
					System.out.print(resultSet.getString(3)+" | ");
					System.out.print(resultSet.getString(4));
					System.out.println();
				}
				
				// Step 6:
				// close connection
				stmt.close();
				connection.close();
				System.out.println("Closed connection to the db successfully!");


	}

}
