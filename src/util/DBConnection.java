package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	private static Connection con;
	private static final String URL = "jdbc:mysql://localhost:3306/loginmvc";
	private static final String DRIVER = "com.mysql.cj.jdbc.driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root123";
	
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}