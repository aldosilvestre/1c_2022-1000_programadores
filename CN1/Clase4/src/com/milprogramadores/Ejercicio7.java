package com.milprogramadores;

public class Ejercicio7 {

	public static void main(String[] args) {
		/**
		 * Declare dos variables de tipo entero una con el nombre divisor y la otra dividendo. Asigne
		 * a dividendo el valor 25 y a la variable divisor el valor 10. muestre el resto (%) de la division
		 * entre dividendo y divisor. Luego a dividendo asigne el valor 25/10. Y vuelva a mostrar el
		 * resto entre dividendo y divisor.
		 */

		int divisor, dividendo;
		dividendo = 25;
		divisor = 10;
		
		System.out.println( dividendo % divisor);
		
		dividendo = 25/10;
		
		// (25/10) / 10 --> 2.5 / 10 -->  2 / 10 --> 2 
		
		// Como el dividendo es entero no guardara el valor de 2.5 sino solo de 2
		// Y como el modulo o resto de dividir 2 / 10 es 2, es lo que termina imprimiendo.
		System.out.println( dividendo % divisor);
	}

}
