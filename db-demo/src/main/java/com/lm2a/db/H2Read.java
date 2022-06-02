package com.lm2a.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class H2Read {

	public static final String READ_USER = "SELECT id, username, email, country, password FROM users WHERE id = ?";


	
	public static void main(String[] args) {
		
		Connection connection = H2ConnectionUtil.getConnection();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(READ_USER);
			preparedStatement.setInt(1, 1);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				int id = rs.getInt("id");
				String username = rs.getString("username");
				String email = rs.getString("email");
				String country = rs.getString("country");
				String password = rs.getString("password");
			    System.out.println(id + "," + username + "," + email + "," + country + "," + password);

			}
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	


}
