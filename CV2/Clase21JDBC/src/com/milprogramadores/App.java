package com.milprogramadores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL_DB = "jdbc:mysql://localhost:3306/milprogramadores";
	private static final String USER = "aldo";
	private static final String PASS = "password";
	
	public static void main(String[] args) throws SQLException {
		
		//Generamos la conexion
		Connection conn = DriverManager.getConnection(URL_DB, USER, PASS);
		
		//Creamos un objeto que enviara las sentencias
		Statement stm = conn.createStatement();
 		
		// Ejecutamos la sentencia sql y optenemos un resultSet con los datos
		ResultSet result = stm.executeQuery("SELECT * FROM ALUMNO");
		
		// Recorremos el RS hasta que no haya siguiente.
		while(result.next()) {
			System.out.println("alumno: " + result.getString("nombre") + " " + result.getString("apellido"));
		}
		
		// Cerramos las conexiones.
		stm.close();
		conn.close();
	}

}
