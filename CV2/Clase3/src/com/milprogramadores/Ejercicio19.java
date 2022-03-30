package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		/*
		 * Dado un numero k natural mayor a 10 mostrar todos los numeros primos que le
		 * anteceden. Por ejemplo si k=12 la salida sera {2,3,5,7,11}
		 */
		
		// Calcular los nros primos menor que uno dado
		// Que son los nros primos = son divisibles por si mismo y por 1
		// k % k = 0 && k % 1 = 0 --> max_divisores = 2
		// mostramos el listado de numero que cumplen la condicion
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese un numero K: ");
		int numero = scanner.nextInt();
		
		while(numero <= 10) {
			System.out.print("El numero ingresado es menor a 10, ingrese otro: ");
			numero = scanner.nextInt();
		}
		
		for(int numeroMenor = 0; numeroMenor <= numero; numeroMenor++) {
			
			if(esPrimo(numeroMenor)) {
				System.out.println("el nro :" + numeroMenor + " es primo");
			}
		}
		scanner.close();
	}
	
	public static boolean esPrimo(int numeroAEvaluar) {
		int max_divisores = 2;
		int contador_divisores = 0;
                // se toma como primo todo numero mayor de 1 divisible por 1 y si mismo. 
		if(numeroAEvaluar == 0 || numeroAEvaluar == 1) {
			return false;
		}
		//5
		for(int divisor = 1; divisor <= numeroAEvaluar; divisor++ ) {
			
			if(numeroAEvaluar % divisor == 0 ) {
				contador_divisores++; // {1, 5} = 2
			}
		}
		return max_divisores == contador_divisores;
	}

}
