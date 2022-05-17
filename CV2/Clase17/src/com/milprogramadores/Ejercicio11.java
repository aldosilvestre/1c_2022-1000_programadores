package com.milprogramadores;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {

	/*
	Ejercicio Nro 11
	Realizar un programa donde ingresen apellidos de personas y
	mostrarlos por pantalla. Estos elementos se almacenarán de acuerdo a la
	prioridad de su apellido.
	Ejemplo:
	Apellidos = Galarza, Soria, Alvarez, Molina
	Lista =Alvarez , Galarza, Molina, Soria
	
	*/
	public static void main(String[] args) {
		
		List<String> listaNombre = new ArrayList<>(); 
		listaNombre.add("Galarza");
		listaNombre.add("Aldana");
		listaNombre.add("Soria");
		listaNombre.add("Alvarez");
		listaNombre.add("Molina");

		System.out.println(listaNombre);
		listaNombre.sort((valor1, valor2) -> valor1.compareTo(valor2));
		System.out.println(listaNombre);
		
	}

}
