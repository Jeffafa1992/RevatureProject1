package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {

	//define database properties
	private static final String USERNAME = "nick_rocksvold";
	private static final String PASSWORD = "oracle";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static Connection connection = null;
	
	//define the static method
	public static Connection getConnection() {
		if(connection != null) {
			return connection;
		}
		else {
			try {
				//load the driver
				Class.forName(DRIVER);
				
				//get connection
				connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			//return connection
			return connection;
		}
	}
}
