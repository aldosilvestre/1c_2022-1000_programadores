package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Declare dos variables base y altura,que representan la base y la altura de un triangulo.
		 *	Asigne un valor cualquiera a cada una y muestre la superficie del mismo.
		 */
		
		/* para calcular el area se necesita la base y altura
		 * formula = (base * altura) / 2
		 */
		int base;
		int altura;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Ingrese la base: ");
		base = scn.nextInt();
		
		System.out.print("Ingrese la altura: ");
		altura = scn.nextInt();
		
		double area = (base * altura) / 2;
		
		System.out.println(area);
		scn.close();
	}

}
