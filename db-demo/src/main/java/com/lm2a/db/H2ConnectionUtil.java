package com.lm2a.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2ConnectionUtil {

	public static final String DB_URL = "jdbc:h2:~/test10"; 
	public static final String USERNAME = "sa";
	public static final String PASSWORD = "";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
}
