package com.hexaware.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Utility class for handling database connections.
 */
public class DBUtil {
	static Connection con;
	/**
     * Retrieves a database connection.
     * @return A database connection.
     */
	public static Connection getDBConn(){
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abcd","root","kathir1323");
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		return con;
		
		
	}

	/**
     * Main method for testing the database connection.
     * @param args Command-line arguments.
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDBConn());
	}

}

