package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		// Dado un natural K. Generar y mostrar todos los numeros enteros pares comprendidos en
		// el intervalos [-K,K]. Considerar K mayor que 1.

		int k;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el numero K :");
		k = scanner.nextInt();
		
		for(int inicio = -k; inicio <= k; inicio++) {
			int valorActual = inicio; // inicio = -10 --> valorActual = -10
			
			if(valorActual % 2 == 0) {
				System.out.println("El valor " + valorActual + " es par.");
			}
		}
		
		scanner.close();
		
		System.out.println("Recorrido con while");
		
		int start = -k;
		while( start <= k) {
			int valorActual = start; // start = -10 --> valorActual = -10
			
			if(valorActual % 2 == 0) {
				System.out.println("El valor " + valorActual + " es par.");
			}
			start++;
		}
		
		System.out.println("Optimizado");
		if(k % 2 != 0 ) {
			k = k-1;
		}
		for(int i = -k; i <= k; i+=2) {
			System.out.println(i);
		}
		
	}

}
