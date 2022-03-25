package com.milprogramadores;

/** Ejemplo para booleanos 
 * 
 * @author aldos
 *
 */
public class Clase2Ejemplo4 {

	public static void main(String[] args) {
		
		// Situacion donde Java establece la prioridad del operador && antes que el ||
		System.out.println(true || true && false);
		/* Explicacion: Debido a que se tienen valores puros en la expresion java se vuelve
		 * Lazy o perezosa, es decir que espera la finalización de la evaluacion de la expresion
		 * para realizar la comprobación de su valor de verdad, usando su prioridad para las 
		 * comprobaciones.
		 */
		
		
		/* La operacion con doble pipe || se vuelve imperactiva, con lo cual al detectar el
		 * primer valor condicional que devuelve Verdadero, corta su ejecucion.
		 */
		System.out.println( devuelveTrue("doble pipe") || devuelveFalse());
		
		
		/* En cambio si colocamos un pipe | evalua toda la expresión por mas que ya el valor
		 * sea Verdadero.
		 */
		System.out.println("-------");
		System.out.println( devuelveTrue("simple pipe") | devuelveFalse());
	}
	
	public static boolean devuelveTrue(String numeroPipes) {
		System.out.println("ingresa a devuelve True con " + numeroPipes);
		return true;
	}
	
	public static boolean devuelveFalse() {
		System.out.println("ingresa a devuelve False");
		return false;
	}
	

}
