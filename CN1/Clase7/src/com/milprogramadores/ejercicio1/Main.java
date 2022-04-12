package com.milprogramadores.ejercicio1;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crear una clase llamada Persona con los atributos: Nombre, Apellido
		 * , DNI, Domicilio. Con los métodos: Constructor y un método que 
		 * permita mostrar la información de la persona.
		 */

		Persona nuevaPersona = new Persona("Pedro", "Perez", 25487652, "Radio Colón 123");
		nuevaPersona.miInformacion();
		
		Persona nuevaPersona2 = new Persona("Juan", "Romulo", 30545851, "Clarin 654");
		nuevaPersona2.miInformacion();
		
	}

}
