package com.milprogramadores.ejemplo;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Suma suma = new Suma(5, 3);
		Suma suma1 = new Suma(25, 5);

		Resta resta = new Resta(8, 7);
		Resta resta1 = new Resta(200, 50);
		
		Multiplicacion multiplicacion = new Multiplicacion(10, 50);
		
		List<Calculable> operaciones = List.of(suma, suma1, resta, resta1, multiplicacion);
		
		for(Calculable operacion : operaciones) {
			operacion.calcular();
		}
		
	}

}
