package com.heroumcaslu.solid.dependencyinversionprinciple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnector {

	private static Connection uniqueInstance;

	public Connection getConnection() {

		if (uniqueInstance == null) {

			try {

				String url = "jdbc:oracle:thin:@localhost:1521:banco";
				String user = "root";
				String password = "";

				uniqueInstance = DriverManager.getConnection(url, user, password);

				return uniqueInstance;

			} catch (SQLException e) {
				// TODO: handle exception
				e.getMessage();
			}

		}
		return uniqueInstance;

	}

}
