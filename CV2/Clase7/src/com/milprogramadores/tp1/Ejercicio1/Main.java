package com.milprogramadores.tp1.Ejercicio1;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crear una clase llamada Persona con los atributos: Nombre, 
		 * Apellido, DNI, Domicilio. Con los métodos: Constructor y un método 
		 * que permita mostrar la información de la persona.
		 */

		Persona nuevaPersona = new Persona("Jose", "Alvarez", 28564123, "Los claros 123");
		nuevaPersona.tuInformacion();
	}

}
