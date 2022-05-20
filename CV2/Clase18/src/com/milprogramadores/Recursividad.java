package com.milprogramadores;

public class Recursividad {

	public static void main(String[] args) {
		
		double base = 2;
		int exp = 8;
		
		double valorCalculado = potencia(base, exp);
		System.out.println(valorCalculado);
		
		
		// fibonacci => 0 1 1 2 3 5 8 13 21 34 ...
		// f(0) = 0 ; f(6) = 8 ; f(8) = 21
		// f(6) = f(5) + f(4) = 8
		int valorFib = fibonacci(6);
		System.out.println(valorFib);
		
		
		int valorFact = factorial(4); // 4 * 3 * 2 * 1 = 24 
		// 4! = 4 * 3!  ==> 3! = 3 * 2! ...
		System.out.println(valorFact);
		
	}

	public static double potencia(double base, int exponente) {
		if(exponente == 0) return 1;
		// 5^3 => 5 * 5^2
		return base * potencia(base, exponente - 1);
	}
	
	public static int fibonacci(int numero) {
		if(numero == 0 || numero == 1 ) return numero;
		return fibonacci(numero - 1) + fibonacci(numero - 2);
	}
	
	public static int factorial(int numero) {
		if( numero == 1 ) return 1;
		return numero * factorial(numero - 1);
	}
	
}
