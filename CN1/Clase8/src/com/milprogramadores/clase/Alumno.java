package com.milprogramadores.clase;

public class Alumno extends Persona{

	private String comision;

	public Alumno(String nombre, String apellido, String comision) {
		super(nombre, apellido);
		this.comision = comision;
	}
	
	public String getComision() {
		return comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	public void saludarComoPersona() {
		super.saludar();
		System.out.println("Alumno !!!");
	}
	
	public void dimeQuienEres() {
		System.out.println("Soy un alumno");
	}
}
