package com.lm2a.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class H2CreateTable {

	public static final String CREATE_TABLE_SQL = "CREATE TABLE users(id IDENTITY, username VARCHAR(20), email VARCHAR(20), country VARCHAR(20), password VARCHAR(20));";
	
	public static void main(String[] args) {
		H2CreateTable h2CreateTable = new H2CreateTable();
		h2CreateTable.createTable();
	}
	
	public void createTable() {
		Connection connection = H2ConnectionUtil.getConnection();
		try {
			Statement statement = connection.createStatement();
			statement.execute(CREATE_TABLE_SQL);
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
