package com.lm2a.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H2Insert {

	public static final String INSERT_USER = "INSERT INTO users(id, username, email, country, password) VALUES(?, ?, ?, ?, ?) ;";

	
	public static void main(String[] args) {
		H2Insert insert = new H2Insert();
		insert.insertRecord();

	}
	
	public void insertRecord() {
		System.out.println(INSERT_USER);
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER);
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "Mario");
			preparedStatement.setString(3, "mario@gmail.com");
			preparedStatement.setString(4, "España");
			preparedStatement.setString(5, "mipasswordsecreto");
			System.out.println(preparedStatement);
			preparedStatement.execute();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
