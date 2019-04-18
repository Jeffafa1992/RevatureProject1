package com.revature.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnectionUtil {

	private static Properties props = getJDBCProperties();
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static Connection connection = null;
	
	public static Connection getConnection() {
		if(connection != null) {
			return connection;
		}
		else {
			try {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(props.getProperty("jdbc.url"), 
                        props.getProperty("jdbc.username"), 
                        props.getProperty("jdbc.password"));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
	
	private static Properties getJDBCProperties() {
		Properties props = new Properties();
		try {
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("application.properties"));
		}catch(IOException e) {
			throw new RuntimeException("Failed to load application.properties");
		}
		return props;
	}
}
