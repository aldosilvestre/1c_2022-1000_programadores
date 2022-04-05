package com.milprogramadores;

public class Ejercicio3Metodos {

	public static void main(String[] args) {
		/*
		 * Crear un método que reciba un numero, si el numero 
		 * esta entre 1 y 100, el método debe devolver un número 1, en otro 
		 * caso debe devolver 0. Los datos para probar este método deben ser ingresados en el main.
		 */

		int nro1, nro2, nro3;
		
		nro1 = 50;
		nro2 = 120;
		nro3 = -52;
		
		int resultado1 = numeroEntre1y100(nro1);
		int resultado2 = numeroEntre1y100(nro2);
		int resultado3 = numeroEntre1y100(nro3);
		
		
		System.out.println("El numero 1 tiene valor de resultado: " + resultado1);
		System.out.println("El numero 2 tiene valor de resultado: " + resultado2);
		System.out.println("El numero 3 tiene valor de resultado: " + resultado3);
	}

	public static int numeroEntre1y100(int numero) {
		if(numero > 1 && numero < 100) {
			return 1;
		}else {
			return 0;
		}
	}
	
}
