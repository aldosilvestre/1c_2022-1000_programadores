package com.milprogramadores;

public class StringCadena {

	public static void main(String[] args) {
		
		String cadena = "hola mundo ";
		String obj = new String("nuevo");
		
		System.out.println(cadena);
		System.out.println(obj);
		
		System.out.println(cadena + obj);

		//Ejemplo
		String nombre = "Aldo";
		String apellido = "Silvestre";
		int dni = 25456425;
		
		String nombreCompleto = nombre + " " + apellido + " - " + dni;
		
		System.out.println(nombreCompleto);
		
		
	}

}
