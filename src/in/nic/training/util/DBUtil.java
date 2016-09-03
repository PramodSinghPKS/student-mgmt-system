package in.nic.training.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	private static String DB_URL = "jdbc:postgresql://localhost:5432/studentinfomgmt";
	private static String USER = "tiger";
	private static String PASSWORD = "tiger";
	private static Connection conn;

	//Method to connect to database
	public static Connection connect() {
		try {
			
			// Code to establish db connection
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			return conn;
		
		} catch (Exception e) {
			
			System.out.println("Error in Database connectivity");
			e.printStackTrace();
			
		}
		return conn;
	}
}
