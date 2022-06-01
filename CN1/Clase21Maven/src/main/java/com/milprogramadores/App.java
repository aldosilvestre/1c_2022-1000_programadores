package com.milprogramadores;

import java.util.List;

import com.milprogramadores.dao.AlumnoDao;
import com.milprogramadores.dto.Alumno;
import com.milprogramadores.utils.HibernateConection;

public class App {

	public static void main(String[] args) {
		
		AlumnoDao dao = new AlumnoDao();
		
		List<Alumno> listaAlumnos = dao.findAll();
		
		for(Alumno alumno: listaAlumnos) {
			String carrera = "no esta cursando";
			if(alumno.getCarrier() != null) {
				carrera = alumno.getCarrier().getName();
			}
			
			System.out.println("alumno: " + alumno.getName() + " " + alumno.getLastName() + " esta cursando: " + carrera);
		}
		
		HibernateConection.getSessionFactory().close();
	}

}
