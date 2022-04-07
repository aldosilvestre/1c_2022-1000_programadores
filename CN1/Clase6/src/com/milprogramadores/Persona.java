package com.milprogramadores;

public class Persona {

	// <encapsulamiento> <tipoDeDato> <nombreAtributo>
	private String nombre;
	private String apellido;
	private int edad;
	private Direccion direccion;
	
	//metodos setter -> para setear la informacion
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	//metodos getter -> para conocer la informacion
	public String getNombre() {
		return nombre;
	}
	
	// <encapsulamiento> <tipoRetorno> <nombreMetodo>( <parametros>){ ... }
	public void cambiarNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public String dimeTuNombre() {
		return nombre;
	}
	
	public static void respirar() {
		System.out.println("Estoy respirando");
	}
	
}
