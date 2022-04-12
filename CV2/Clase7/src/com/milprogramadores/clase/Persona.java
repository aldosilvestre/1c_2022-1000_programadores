package com.milprogramadores.clase;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	
	
	// constructor por defecto --> public Persona(){}
	public Persona() {}
	
	/** Constructor con nombre, apellido y edad
	 * 
	 * @param nombre
	 * @param apellidoParam
	 * @param edadParam
	 */
	public Persona(String nombre, String apellidoParam, int edadParam) {
		this.nombre = nombre;
		this.apellido = apellidoParam;
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
	// metodo de instancia
	public void imprimirDatos() { 
		System.out.println(this.nombre + " " + this.apellido + " " + this.edad);
	}
	
	// metodo de clase
	public static void respirar(){
		System.out.println("Estoy respirando");
	}
}
