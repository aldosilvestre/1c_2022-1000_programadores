package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio5 {

	
	public static void main(String[] args) {
		
		/**
		 * Declare un variable de tipo entero y asigne un valor cualquiera, determine si el numero es
		 * par o impar y muestre un mensaje con esa informacion. mensaje: "El numero... es (par o
		 * impar)"
		 */
		
		int numero;
		
		// Ctrl + Shift + o --> Hace un autoimport de las librerias que utiliza

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el numero a calcular la paridad: ");
		numero = scanner.nextInt();
		
		
		// si es par, el modulo de dividir por 2 es 0, sino es impar
		if(numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par.");
		}else {
			System.out.println("El numero " + numero + " es impar.");
		}
		
		scanner.close();
	}
	
}
