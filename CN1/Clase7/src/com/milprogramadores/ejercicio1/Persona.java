package com.milprogramadores.ejercicio1;

public class Persona {

	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;
	
	public Persona(String nombre, String apellido, int dni, String domicilio) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.domicilio = domicilio;
	}
	
	/** Este metodo imprime la informacion de la Persona
	 * 
	 */
	public void miInformacion() {
		System.out.println( this.nombre + " " + this.apellido + " " + this.dni + " " + this.domicilio);
	}
	
}
