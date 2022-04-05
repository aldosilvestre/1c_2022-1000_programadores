package com.milprogramadores;

import java.util.Scanner;

public class MetodoReutilizacion {

	public static void main(String[] args) {
		iterar(2);
	}
	
	public static void iterar(int veces) {
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < veces; i++) {
			int valor = scanner.nextInt();
			duplicarYImprimir(valor);
		}
		scanner.close();
	}
	
	public static void duplicarYImprimir(int valor) {
		int nuevo = valor * 2;
		System.out.println("El numero nuevo es:" + nuevo);
	}
	
}


