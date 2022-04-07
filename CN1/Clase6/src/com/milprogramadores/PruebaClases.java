package com.milprogramadores;

public class PruebaClases {

	public static void main(String[] args) {
		
		Persona aldo = new Persona();
		
		aldo.cambiarNombre("Aldo");
		
		Persona.respirar();
		aldo.respirar();
		
		System.out.println(aldo.dimeTuNombre());
		
	}

}
