package com.milprogramadores;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8Array {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> nombres = new ArrayList<String>();
		//ctrl + shift + o --> autoimport
		
		
		// TODO: Hacer el for para que reciba los 10 nombres
		nombres.add("Aldo");
		nombres.add("Jose");
		nombres.add("Juan");
		nombres.add("Maria");
		nombres.add("Antonia");
		nombres.add("Sarasa");
		nombres.add("Pedro");
		
		System.out.println(nombres);
		
		System.out.print("Ingrese el nombre a buscar: ");
		String nombreABuscar = scanner.nextLine();
		boolean nombreEncontrado = false;
		
		for(int posicion = 0; posicion < nombres.size(); posicion++ ) {
			if(nombres.get(posicion).equals(nombreABuscar)) {
				nombreEncontrado = true;
			}
		}
		
		if(nombreEncontrado) {
			System.out.println("Nombre encontrado");
		}else
			System.out.println("Nombre no encontrado");
		
	}

}
