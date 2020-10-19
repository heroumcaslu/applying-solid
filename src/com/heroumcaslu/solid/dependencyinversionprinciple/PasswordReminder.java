package com.heroumcaslu.solid.dependencyinversionprinciple;

import java.sql.Connection;

public class PasswordReminder {
	
	private Connection databaseConnection;
	
	public PasswordReminder(DatabaseConnector connection) {
		
		this.databaseConnection = connection.getConnection();
		
	}

}
