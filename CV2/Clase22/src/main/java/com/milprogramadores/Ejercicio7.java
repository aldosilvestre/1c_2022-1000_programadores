package com.milprogramadores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejercicio7 {

	/*
	** Utilizando la base de Datos universidad creada en el practico anterior Realizar las
	siguientes Consultas desde un programa en JAVA para obtener de la BDD los siguientes datos**

	a. Todas las personas que tengan como valor 'M' en su atributo sexo
	b. Todas las personas que tengan como valor 'profesor' en su atributo tipo
	c. ¿Existe algún profesor hombre en la universidad ?
	d. ¿Cuántos son los alumnos Hombres en la universidad ?
	e. Nombre de alumno/s que empieza con la letra 'J'
	f. Cual es el numero de telefono de el registro de la tabla persona cuyo atributo nombre es
		'Juan' y su atributo apellido1 es 'Saez'
	*/
	public static void main(String[] args) throws SQLException {
		
		try {
			Statement stm = ConexionMysql.getStatement();	
			ResultSet result = null;
			
			System.out.println("--- a --- ");
			result = stm.executeQuery("select * from persona p where p.sexo = 'M'");
			while(result.next()) {
				System.out.println("persona: " + result.getString("nombre") + " " + result.getString("apellido1"));
			}
			System.out.println("--- b --- ");
			result = stm.executeQuery("select * from persona p where p.tipo = 'profesor'");
			while(result.next()) {
				System.out.println("persona: " + result.getString("nombre") + " " + result.getString("apellido1"));
			}
			System.out.println("--- c --- ");
			result = stm.executeQuery("select (COUNT(*) > 0 ) as existe  from persona p where p.sexo = 'H' and p.tipo = 'profesor'");
			while(result.next()) {
				System.out.println("existe profesor: " + result.getBoolean("existe"));
			}
			System.out.println("--- d --- ");
			result = stm.executeQuery("select COUNT(*) as cantidad from persona p where p.sexo = 'H'");
			while(result.next()) {
				System.out.println("cantidad hombre: " + result.getInt("cantidad"));
			}
			System.out.println("--- e --- ");
			result = stm.executeQuery("select * from persona p where p.nombre like 'J%'");
			while(result.next()) {
				System.out.println("persona: " + result.getString("nombre") + " " + result.getString("apellido1"));
			}
			System.out.println("--- f --- ");
			result = stm.executeQuery("select telefono from persona p where p.nombre = 'Juan' and p.apellido1 = 'Saez'");
			while(result.next()) {
				System.out.println("telefono: " + result.getString("telefono"));
			}
			
			stm.close();
		}catch(SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		
		

	}

}
