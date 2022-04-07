package com.milprogramadores;

public class Main {

	public static void main(String[] args) {
		
		Persona aldo = new Persona("Nacho");
		
		System.out.println(aldo.dimeTuNombre());
		
		aldo.tuNombreEs("Aldo");
		
		System.out.println(aldo.dimeTuNombre());
		
		aldo.respirar();
		Persona.respirar();
		
	}

}
