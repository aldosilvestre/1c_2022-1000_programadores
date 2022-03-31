package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// Dado un numero natural K determinar si es capicua.
		// Nota: un numero capicua es aquel que se lee igual de derecha a izquierda y de izquierda a derecha.
		
		int k;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el numero K :");
		k = scanner.nextInt();
		
		// 15351 es capicua 
		// 15351 % 10 --> 1 --> aux = 1
		// k = 1535 , aux = 1
		// 1535 % 10 --> 5 --> aux = aux * 10 + 5 --> 15
		// k = 153 
		// 153 % 10 
		int original = k;
		int aux = k % 10;
		k = k / 10;
		
		while(k > 0) {
			aux = (aux * 10) + (k % 10);
			k /= 10; // k = k / 10
		}

		if(aux == original) {
			System.out.println("Es capicua");
		}else {
			System.out.println("No es capicua");
		}
		
		scanner.close();
	}

}
