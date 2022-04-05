package com.milprogramadores;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Crear un método que reciba dos números reales este método debe devolver la multiplicación 
		// entre esos dos números. Los números para probar este método deben ser ingresados en el main.

		float valor1 = 5.0f;
		float valor2 = 7.0f;
		float resultado = multiplicar(valor1, valor2);
		System.out.println(resultado);
	}

	public static float multiplicar(float nro1, float nro2) {
		return (nro1 * nro2);
	} 
	
}
