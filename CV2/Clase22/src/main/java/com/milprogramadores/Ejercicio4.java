package com.milprogramadores;

import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio4 {

	/*
	Utilizando la BDD universidad creada en el práctico anterior agregar 3 alumnos y 1 docente
	en los registros de la tabla persona
	*/
	public static void main(String[] args) {
		
		try {
			Statement stm = ConexionMysql.getStatement();
		
			stm.executeUpdate("INSERT INTO persona(nif, nombre, apellido1, ciudad, direccion, fecha_nacimiento, sexo, tipo) VALUE('12345678F', 'Victoria', 'Real', 'Salta', 'calle 123', '1994-03-28', 'M', 'alumno')");
			stm.executeUpdate("INSERT INTO persona(nif, nombre, apellido1, ciudad, direccion, fecha_nacimiento, sexo, tipo) VALUE('54645678F', 'Daniel', 'Rios', 'Cordoba', 'colon 2333', '1990-02-27', 'H', 'alumno')");
			stm.executeUpdate("INSERT INTO persona(nif, nombre, apellido1, ciudad, direccion, fecha_nacimiento, sexo, tipo) VALUE('54625678G', 'Maria', 'Ponizzi', 'Caba', 'km 6 S/N ', '1982-01-20', 'M', 'alumno')");
			
			stm.executeUpdate("INSERT INTO persona(nif, nombre, apellido1, ciudad, direccion, fecha_nacimiento, sexo, tipo) VALUE('56781234A', 'Luis', 'Gomez', 'Salta', 'San Martin 130', '1954-07-25', 'H', 'profesor')");
			
			stm.close();
		}catch(SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
	}

}
