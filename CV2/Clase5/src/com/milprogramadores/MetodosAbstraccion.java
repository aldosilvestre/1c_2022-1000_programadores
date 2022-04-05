package com.milprogramadores;

import java.util.ArrayList;
import java.util.Scanner;

public class MetodosAbstraccion {

	public static void main(String[] args) {
		
		int veces = pedirVecesARepetir();
		ArrayList<String> resultado = pedirNombres(veces);
		imprimirResultado(resultado);
	}
	
	public static void imprimirResultado(ArrayList<String> resultado) {
		System.out.println(resultado);
	}
	
	public static int pedirVecesARepetir() {
		Scanner scanner = new Scanner(System.in);
		int vecesARepetir = scanner.nextInt();
		scanner.close();
		return vecesARepetir;
	}
	
	public static ArrayList<String> pedirNombres(int veces) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		for(int i = 0; i < veces; i++) {
			
			System.out.println("Ingrese un nombre: ");
			String nombreIngresado = scanner.nextLine();
			nombres.add(nombreIngresado);
		}
		
		return nombres;
		
	}

}
