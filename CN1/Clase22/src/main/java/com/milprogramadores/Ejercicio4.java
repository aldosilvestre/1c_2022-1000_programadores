package com.milprogramadores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/** Ejercicio 4 del segundo tp de BDD 
 * 
 * @author aldo
 *
 */
public class Ejercicio4 {

	/**
Utilizando la BDD universidad creada en el práctico anterior agregar 3 alumnos y 1 docente
en los registros de la tabla persona
	 */	
	public static void main(String[] args) {
		
		Statement stm = ConexionMysql.getStatement();

		try {
			stm.executeUpdate("INSERT INTO persona(nif, nombre, apellido1, ciudad, direccion, telefono, fecha_nacimiento, sexo, tipo) VALUES('64656557M', 'Mario', 'Liendro', '    ', 'Diario del Norte 4223', '387555566', '1994-08-01', 'H', 'profesor')");
		}catch(SQLException e) {
			System.out.println(e.getLocalizedMessage());
			try {
				stm.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}

}
