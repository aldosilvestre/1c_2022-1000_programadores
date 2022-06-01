package com.milprogramadores.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.milprogramadores.config.HibernateConfig;
import com.milprogramadores.dto.Alumno;

public class AlumnoDao {

	public void save(Alumno alumno) {
		Transaction transaction = null;
        try (Session session = HibernateConfig.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(alumno);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
	}
	
	public List<Alumno> findAll(){
		Session session = HibernateConfig.getSessionFactory().openSession();
		return session.createQuery("from Alumno", Alumno.class).list();
	}
	
	
}
