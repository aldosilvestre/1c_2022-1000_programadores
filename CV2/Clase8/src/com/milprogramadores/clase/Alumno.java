package com.milprogramadores.clase;

public class Alumno extends Persona{

	private int curso;
	
	public Alumno(String nombre, String apellido, int curso) {
		super(nombre, apellido);
		this.curso = curso;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	
	public String saludarComoAlumno() {
		return super.saludar() + " soy Alumno";
	}
	
	public void dimeAlgo() {
		System.out.println("Estoy estudiando");
	}
	
}
