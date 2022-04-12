package com.milprogramadores.tp1.Ejercicio1;

public class Persona {

	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;
	
	public Persona(String nombre, String apellido, int dni, String domicilio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	public void tuInformacion() {
		System.out.println(this.nombre + " " + this.apellido + " " + this.dni + " " + this.domicilio);
	}
	
	
}
