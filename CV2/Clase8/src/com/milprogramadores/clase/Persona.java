package com.milprogramadores.clase;

public class Persona {

	private String nombre;
	private String apellido;
	private Domicilio domicilio;
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	
	public Domicilio getDomicilio() {
		return domicilio;
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
	
	public String saludar() {
		return "Hola";
	}
	
	public void dimeAlgo() {
		System.out.println("Soy una persona");
	}

}
