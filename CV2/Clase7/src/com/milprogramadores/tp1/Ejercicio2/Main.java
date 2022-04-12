package com.milprogramadores.tp1.Ejercicio2;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crear una clase NumerosEnteros y redefinir las operaciones elementales (+, -, *, /). 
		 * Esta clase tendrá los métodos suma (), resta(), multiplicación() y división() 
		 * que recibirán como parámetros otro objeto de la misma clase NumerosEnteros.
		 */
		
		NumerosEnteros numero5 = new NumerosEnteros(5);
		NumerosEnteros numero2 = new NumerosEnteros(2);
		
		double resultadoSuma = numero2.suma(numero5);
		System.out.println(resultadoSuma);
		
		double resultadoDivision = numero2.division(numero5);
		System.out.println(resultadoDivision);
	}

}
