package com.milprogramadores;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		/**
		 * Declarar dos variables, asignar un valor cualquiera y realizar las 
		 * siguientes operaciones:
		 * 	Mostrar la suma
		 *  Mostrar la multiplicacion
		 *  Mostrar la resta
		 *  Mostrar Division
		 */
		Scanner scanner = new Scanner(System.in);
		
		int variable1, variable2;
		
		System.out.print("Ingrese el valor 1: ");
		variable1 = scanner.nextInt();
		System.out.print("Ingrese el valor 2: ");
		variable2 = scanner.nextInt();
		
		int eleccion = 0;
		
		System.out.print("Ingrese que quiere hacer 1: suma, 2: resta, 3: multiplicacion, 4: division --> ");
		eleccion = scanner.nextInt();
		
		switch (eleccion) {
			case 1: 
				suma(variable1, variable2);
				break;
			case 2: 
				resta(variable1, variable2);
				break;
			case 3: 
				multiplicacion(variable1, variable2);
				break;
			case 4: 
				division(variable1, variable2);
				break;
		}
		scanner.close();
	}
	
	public static void suma(int valor1, int valor2) {
		System.out.println(valor1 + valor2);
	}
	
	public static void resta(int nro1, int nro2) {
		System.out.println(nro1 - nro2);
	}

	public static void multiplicacion(int nro1, int nro2) {
		System.out.println(nro1 * nro2);
	}
	
	public static void division(int nro1, int nro2) {  
		if(nro2 == 0) {
			System.out.println("No se puede dividir por 0.");
		}else {
			System.out.println(nro1 / nro2);
		}
		
	}
}
