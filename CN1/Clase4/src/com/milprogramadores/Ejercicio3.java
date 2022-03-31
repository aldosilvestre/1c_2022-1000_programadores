package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/**
		 * Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar el mayor y el menor.
		 * 
		 */

		int variable1, variable2, variable3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese la primer variable entera: ");
		variable1 = scanner.nextInt();
		
		System.out.print("Ingrese la segunda variable entera: ");
		variable2 = scanner.nextInt();
		
		System.out.print("Ingrese la tercer variable entera: ");
		variable3 = scanner.nextInt();
		
		
		if(variable1 > variable2 && variable1 > variable3) {
			System.out.println("La variable 1 es Mayor");
		}else if ( variable2 > variable1 && variable2 > variable3){
			System.out.println("La variable 2 es Mayor");
		}else if ( variable3 > variable1 && variable3 > variable2) {
			System.out.println("La variable 3 es Mayor");
		}
		
		if(variable1 < variable2 && variable1 < variable3) {
			System.out.println("La variable 1 es Menor");
		}else if ( variable2 < variable1 && variable2 < variable3){
			System.out.println("La variable 2 es Menor");
		}else if ( variable3 < variable1 && variable3 < variable2) {
			System.out.println("La variable 3 es Menor");
		}
		
		scanner.close();
	}

}
