package com.milprogramadores;

import java.sql.SQLException;
import java.util.List;

import com.milprogramadores.config.HibernateConfig;
import com.milprogramadores.dao.AlumnoDao;
import com.milprogramadores.dto.Alumno;

public class App {

	public static void main(String[] args) throws SQLException {
		
		AlumnoDao dao = new AlumnoDao();
		
		List<Alumno> listaAlumnos = dao.findAll();
		
		for(Alumno alumno : listaAlumnos) {
			String cursando = "";
			if(alumno.getCarrier() == null) {
				cursando = "no cursa";
			}else {
				cursando = alumno.getCarrier().getName();
			}
			
			System.out.println("alumno: " + alumno.getName() + " " + alumno.getLastname() + ", esta cursando: " + cursando);
			
		}
		
		HibernateConfig.getSessionFactory().close();
	}

}
