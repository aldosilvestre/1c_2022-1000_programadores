package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio19 {

	public static String nombre= "Ejercicio 19";
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		
		int numero = scanner.nextInt();
		
		while(numero < 10) {
			System.out.println("El numero ingresado es menor que 10");
			System.out.print("Ingrese otro: ");
			numero = scanner.nextInt();
		}
		
		System.out.println("El numero ingresado es: " + numero);
		for(int indice=0;indice <= numero; indice++) {
			// 0,1,2,3...numero
			if(esPrimo(indice)) {
				System.out.println("El numero " + indice + " es primo");
			}
		}
		scanner.close();
	}
	
	/** Este metodo calcula si un numero es primo
	 * 
	 * @param numeroComoArgumento
	 * @return
	 */
	public static boolean esPrimo(int numeroComoArgumento) {
		// es primo cuando es divisible por 1 y si mismo
		if( numeroComoArgumento == 1 || numeroComoArgumento == 0) {
			return false;
		}
		int divisores = 0;
		int max_divisores = 2;
			
		// 3 es primo por que es divisible por 1 y 3
		/*
		 * numeroComoArgumento = 4
		 * 4/1 , 4/2 , 4/3 , 4/4
		 */
		for(int divisor = 1; divisor <= numeroComoArgumento; divisor++) {
			if(numeroComoArgumento % divisor == 0) {
				divisores++;
			}
		}
				
		return divisores == max_divisores;
	}

}
