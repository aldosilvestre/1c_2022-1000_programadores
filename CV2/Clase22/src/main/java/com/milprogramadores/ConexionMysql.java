package com.milprogramadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionMysql {

	//private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL_BD = "jdbc:mysql://localhost:3306/universidad";
	private static final String USER = "aldo";
	private static final String PASS = "password";
	
	public static Statement getStatement() {		
		try {
			Connection conn = DriverManager.getConnection(URL_BD, USER, PASS);
			return conn.createStatement();
		}catch(SQLException error) {
			System.out.println(error.getLocalizedMessage());
		}
		return null;
	}
	
	
}
