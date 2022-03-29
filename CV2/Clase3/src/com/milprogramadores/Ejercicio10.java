package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio10 {

	
	public static void main(String[] args) {
		/*
		Declare dos variables base y altura,que representan la base y la altura de un triangulo.
		Asigne un valor cualquiera a cada una y muestre la superficie del mismo.
		 * 
		 */

		// el area o la superficie 
		// area = (base * altura) / 2
		// ingresarlos por teclado
		// mostrarlo por pantalla
		
		int base; 
		int altura;
		double area;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese el valor de la base: ");
		base = scanner.nextInt();
		
		System.out.print("Ingrese el valor de la altura: ");
		altura = scanner.nextInt();
		
		area = (base * altura ) / 2;
		
		System.out.println("El area del triangulo es: " + area);
		
		scanner.close();
	}
	
	
	
}
