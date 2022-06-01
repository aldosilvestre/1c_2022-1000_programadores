package com.milprogramadores;

import com.milprogramadores.dao.AlumnoDao;
import com.milprogramadores.dto.Alumno;
import com.milprogramadores.utils.HibernateConection;

public class AppSave {

	public static void main(String[] args) {
		
		AlumnoDao alumnoDao = new AlumnoDao();

		Alumno nuevoAlumno = new Alumno();
		nuevoAlumno.setName("Esteban");
		nuevoAlumno.setLastName("Sarasa");
		
		alumnoDao.save(nuevoAlumno);
		
		
		HibernateConection.getSessionFactory().close();
	}

}
