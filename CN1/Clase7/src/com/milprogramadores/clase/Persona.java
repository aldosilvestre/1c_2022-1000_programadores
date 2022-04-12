package com.milprogramadores.clase;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	
	// constructor vacio o por defecto y se lo llama asi --> new Persona()
	public Persona() {
		
	}
	
	
	/** Constructor para persona con parametros
	 * 
	 * @param nombreParam
	 * @param apellParam
	 * @param edadParam
	 */
	public Persona(String nombreParam, String apellParam, int edadParam) {
		nombre = nombreParam;
		this.apellido = apellParam;
		this.edad = edadParam;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
