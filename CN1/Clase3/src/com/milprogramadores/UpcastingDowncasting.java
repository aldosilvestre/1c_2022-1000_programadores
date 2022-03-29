package com.milprogramadores;

public class UpcastingDowncasting {

	public static void main(String[] args) {
		// Ejemplo de Upcasting con numeros
		// 10   :: Entero
		// 10.0 :: Flotante
		double numero = 10.005;
		int numeroComoEntero = (int) numero;
		
		System.out.println(numeroComoEntero);
		
		// Ejemplo de Downcasting
		
		int numeroEntero = 5;
		float numeroComoDouble = (float) numeroEntero;
		
		System.out.println(numeroComoDouble);
		
		
		int caracter = 97;
		System.out.println((char) caracter);
		
	}

}
