package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/**
		 * Declarar tres variables de tipo entero, asignar un valor cualquiera y 
		 * mostrar el mayor y el menor.
		 */
		
		Scanner scanner = new Scanner(System.in);// ctrl + shift + o para autoimportar
		
		int variable1, variable2, variable3;
		
		System.out.print("Ingrese la variable 1: ");
		variable1 = scanner.nextInt();
		System.out.print("Ingrese la variable 2: ");
		variable2 = scanner.nextInt();
		System.out.print("Ingrese la variable 3: ");
		variable3 = scanner.nextInt();
		
		if( variable1 > variable2 && variable1 > variable3) {
			System.out.println("La variable 1 es mayor");
		}else if(variable2 > variable1 && variable2 > variable3) {
			System.out.println("La variable 2 es mayor");
		}else if(variable3 > variable1 && variable3 > variable2) {
			System.out.println("La variable 3 es mayor");
		}
		
		
		if( variable1 < variable2 && variable1 < variable3) {
			System.out.println("La variable 1 es menor");
		}else if(variable2 < variable1 && variable2 < variable3) {
			System.out.println("La variable 2 es menor");
		}else if(variable3 < variable1 && variable3 < variable2) {
			System.out.println("La variable 3 es menor");
		}
		
		System.out.print("Sin salto incluido \n");
		
		System.out.println("Con salto incluido");// print line --> imprimir linea 
		
		scanner.close();
	}

}
