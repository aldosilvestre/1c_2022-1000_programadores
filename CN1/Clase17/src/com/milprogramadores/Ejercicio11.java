package com.milprogramadores;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {
	/*
	Realizar un programa donde ingresen apellidos de personas y mostrarlos por pantalla. Estos elementos se almacenarán de acuerdo a la prioridad de su apellido.

		Ejemplo:
		Apellidos = Galarza, Soria, Alvarez, Molina

		Lista =Alvarez , Galarza, Molina, Soria
	*/
	public static void main(String[] args) {

		List<String> listaNombres = new ArrayList<>();
		
		listaNombres.add("Galarza");
		listaNombres.add("Soria");
		listaNombres.add("Alvarez");
		listaNombres.add("Molina");
		
		listaNombres.sort((cadena1, cadena2) -> cadena1.compareTo(cadena2));
		
		System.out.println(listaNombres);
		
	}

}
