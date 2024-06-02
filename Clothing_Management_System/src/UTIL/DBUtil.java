package UTIL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/clothingmanagementsystem";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "root";
    private static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
    	Class.forName(JDBC_DRIVER);
    	Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		System.out.println("Connection establish succesfully");
		return connection;
    }
}
