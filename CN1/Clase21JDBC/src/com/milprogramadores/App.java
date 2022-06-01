package com.milprogramadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL_DB = "jdbc:mysql://localhost:3306/milprogramadores";
	private static final String USER = "aldo";
	private static final String PASS = "password";
	
	
	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection(URL_DB, USER, PASS);

		Statement stm = conn.createStatement();
		
		ResultSet res = stm.executeQuery("SELECT * FROM ALUMNO");
		
		while(res.next()) {
			
			System.out.println(res.getString("nombre"));
			
		}
		
		stm.close();
		conn.close();
	}

}
