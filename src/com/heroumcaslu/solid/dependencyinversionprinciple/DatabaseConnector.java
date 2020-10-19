package com.heroumcaslu.solid.dependencyinversionprinciple;

import java.sql.Connection;

public interface DatabaseConnector {

	Connection getConnection();

}
