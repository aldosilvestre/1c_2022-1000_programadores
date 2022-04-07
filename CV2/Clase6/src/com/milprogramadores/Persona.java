package com.milprogramadores;

import clase1.Auto;

public class Persona {
	
	private String nombre;
	private Auto auto;
	
	//<encapsulamiento> <NombreClase>(<valoresSeparadosPorComa>){ <seteo los valores>}
	public Persona(String nombreNacimiento) {
		this.nombre = nombreNacimiento;
	}
	
	// metodo de instancia
	// <encapsulamiento> <tipoDeRetorno> <nombreMetodo>(<parametros>){ ... }
	public String dimeTuNombre() {
		return this.nombre;
	}
	
	public void tuNombreEs(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}

	// Metodos de Clase
	// <encapsulamiento> static <tipoRetorno> <nombreMetodo>(<parametros>){...}
	public static void respirar() {
		
		System.out.println("estoy respirando");
	}
	
}
