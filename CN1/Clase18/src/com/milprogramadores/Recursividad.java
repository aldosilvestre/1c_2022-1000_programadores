package com.milprogramadores;

public class Recursividad {

	public static void main(String[] args) {
		
		
		double resultado = potencia(2, 8);
		
		System.out.println(resultado);
		
		int val = factorial(5);
		System.out.println(val);
		// 5 * 4 * 3 * 2 * 1
		
		
		// serie fibonacci
		// 0 1 1 2 3 5 8 13 21 34
		int resultadoFib = fibonacci(5);
		// 8
		System.out.println(resultadoFib);
	}

	public static double potencia(double base, int exp) {
		if(exp == 0) return 1;
		// 5^3 ==> 5 * 5^2
		return base * potencia(base, exp - 1);
	}
	
	public static int factorial(int numero) {
		if(numero == 0 || numero == 1) return 1;
		// 5! ==> 5 * 4! 
		return numero * factorial(numero - 1);
	}
	
	public static int fibonacci(int numero) {
		if(numero == 0 || numero == 1 ) return numero;
		return fibonacci(numero - 1) + fibonacci(numero - 2);
	}
	
}
