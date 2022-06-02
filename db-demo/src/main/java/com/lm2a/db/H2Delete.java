package com.lm2a.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class H2Delete {

	public static final String DELETE_USER = "DELETE from users WHERE id = ?";

	
	public static void main(String[] args) {
		H2Delete h2Delete = new H2Delete();
		h2Delete.deleteUser(1);
	}
	
	public void deleteUser(int id) {
		Connection connection = H2ConnectionUtil.getConnection();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(DELETE_USER);
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		

	}

}
