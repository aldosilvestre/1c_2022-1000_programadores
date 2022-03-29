package com.milprogramadores;

public class UpcastingDowncasting {

	public static void main(String[] args) {

		int numeroEntero = 5;
		double numeroDouble = 5.00;
		
		// Upcasting  
		// 5.00 :: Double 
		// 5    :: Entero
		
		int numeroUpcasteado = (int) numeroDouble;
		System.out.println(numeroUpcasteado);
		
		// Downcasting
		// 5    :: Entero
		// 5.00 :: Double
		
		double numeroDowncasteado = (double) numeroEntero;
		System.out.println(numeroDowncasteado);
		
		
		//Ejemplo
		int caracter = 98;
		char convertido = (char) caracter;
		System.out.println(convertido);
		
		
		// Ejemplo
		double num1 = 17.56;
		int num2 = (int) num1;
		double num3 = (double) num2;
		
		System.out.println(num3);
		
	}

}
