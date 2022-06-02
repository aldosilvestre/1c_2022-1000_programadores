package com.milprogramadores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BuscarPersona {

	
	public static String getPersona(Long id) {
		
		try {
			Statement stm = ConexionMysql.getStatement();
			ResultSet result = stm.executeQuery( "select nombre, apellido1 from persona where id=" + id);
			if(result.next()) {
				return result.getString("nombre") + " " + result.getString("apellido1");
			}
		}catch(SQLException e) {
			System.out.println(e.getLocalizedMessage());
		}
		return null;
	}
	
}
