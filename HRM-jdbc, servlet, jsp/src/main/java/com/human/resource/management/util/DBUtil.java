package com.human.resource.management.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {

		final private String URL ="jdbc:mysql://localhost:3306/human_resource_management";
		final private String USERNAME = "root";
		final private String PASSWPRD = "root";
		final private String DRIVER = "com.mysql.cj.jdbc.Driver";
		
		public Connection getConnection() throws Exception {
			Class.forName(DRIVER);
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWPRD);
			System.out.println("Database connection established sucessfully");
			return connection;
		}
		
		public void close(ResultSet rs, PreparedStatement pstmt, Connection conn) throws SQLException {
			if(rs!=null)
				rs.close();
			if(pstmt!=null)
				pstmt.close();
			if(conn!=null)
				conn.close();
		}
		
		public void close(PreparedStatement pstmt, Connection conn) throws SQLException {
			close(null, pstmt, conn);
		}
		
		public void close(ResultSet rs, PreparedStatement pstmt) throws SQLException {
			close(rs, pstmt, null);
		}
		
		public void close(PreparedStatement pstmt) throws SQLException {
			close(null, pstmt, null);
		}
		
		
}
