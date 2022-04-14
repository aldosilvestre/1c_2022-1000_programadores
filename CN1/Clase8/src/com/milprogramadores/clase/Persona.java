package com.milprogramadores.clase;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	private LocalDate fechaNacimiento; // 1987-05-23
	
	public Persona() {}
	
	protected Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public void saludar() {
		System.out.println("Hola!!!");
	}

	
	public void dimeQuienEres() {}
	
}
