package com.milprogramadores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) throws SQLException {
		
		Statement stm = ConexionMysql.getStatement();

		ResultSet result = stm.executeQuery("select * from persona");
		
		while(result.next()) {
			System.out.println("persona: " + result.getString("nombre") + " " + result.getString("apellido1"));
		}
		
		stm.close();
		
	}

}
