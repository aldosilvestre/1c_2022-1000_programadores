package com.milprogramadores.ejercicio3;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crear una clase NumerosEnteros y redefinir las operaciones elementales (+, -, *, /). 
		 * Esta clase tendrá los métodos suma (), resta(), multiplicación() y división() que 
		 * recibirán como parámetros otro objeto de la misma clase NumerosEnteros.
		 */

		NumeroEnteros numero5 = new NumeroEnteros(5);
		NumeroEnteros numero2 = new NumeroEnteros(2);
		
		int resultadoSuma = numero5.suma(numero2);
		System.out.println(resultadoSuma);
		
		int resultadoResta = numero5.resta(numero2);
		System.out.println(resultadoResta);
		
		numero5.multiplicacion();
		numero5.division();

		
		NumeroEnteros numeroCualquiera = new NumeroEnteros(5000);
		numeroCualquiera.suma(numero5);
		int resultadoNumeroCualquiera = numero5.suma(numeroCualquiera);
		System.out.println(resultadoNumeroCualquiera);
		
	}

}
