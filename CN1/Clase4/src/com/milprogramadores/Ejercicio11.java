package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/**
		 * Dado 3 numeros naturales que representan los lados de un triángulo, se pide determinar
		 * si el triángulo es Isosceles, Escaleno o Equilatero.
		 
		 * Info
		
		 * Ejercicio 11
		 * Tipos de triángulo según la longitud de sus lados Según la longitud de sus lados, los triángulos pueden clasificarse en:
		 * 1. Equilátero: Todos sus lados son iguales.
		 * 2. Isósceles: Dos de sus tres lados son de igual longitud.
		 * 3. Escaleno: Todos sus lados son de diferente longitud.
		 */

		// numeros naturales mayores que 0.
		int lado1, lado2, lado3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el lado1 : ");
		lado1 = scanner.nextInt();
		
		System.out.print("Ingrese el lado2 : ");
		lado2 = scanner.nextInt();
		
		System.out.print("Ingrese el lado3 : ");
		lado3 = scanner.nextInt();
		
		// a == b y b == c --> a == c
		if(lado1 == lado2 && lado2==lado3) {
			System.out.println("Es equilatero");
		}else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.println("Es isosceles");
		}else {
			System.out.println("Es escaleno");
		}
		
		scanner.close();
	}

}
