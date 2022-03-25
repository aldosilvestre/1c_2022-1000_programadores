package com.milprogramadores;

/** Ejemplo para operadores
 * 
 * @author aldos
 *
 */
public class Clase2Ejemplo3 {
	
	
	public static void main(String[] args) {
		
		/*
		  En java existen los tipicos operadores diarios
		  
		  + suma
		  - resta 
		  * multiplicacion
		  / division
		  
		*/
		
		// Por ejemplo
		
		int suma = 5 + 5;
		int resta = 5 - 3;
		int multiplicacion = 2 * 8;
		int division = 4 / 2; // El tipo de dato tiene que ver aqui, ya que si lo dejo como entero (int) lo trunca (lo corta a su valor entero)
		int modulo = 5 % 2; // Es el resto de dividir 5 entre 2 que es igual a 1;
		
		
		// Parentesis son los de mayor prioridad en una expresion sindo solo resueltos por orden de predecesion.
		int parentesis = (1 * ( 2 * 3));
		
		// A los parentesis les continuan los valores de incremento o decremento, o bien negacion del valor de verdad
		int numero = 0;
		numero++; // significa numero = numero + 1
		numero--; // significa numero = numero - 1
		++numero; // significa numero = 1 + numero 
		--numero; // significa numero = 1 - numero 
		
		boolean boleano = true; // el valor es true
		boleano = !boleano; // ahora el valor es false
		
		// Prioridad de una expresion aritmetica simple
		int valor = 5 + 3 * 4 / 2; // Si la expresion no esta separada se usa la prioridad aritmetica y el operador modulo comparte prioridad con la multiplicacion y division.  
		System.out.println(valor); 
		
		// Continuando con la prioridad los comparadores <, <=, >, >= son los operadores con mayor que los de distinto != o es igual ==
		
		
		// El operador con menor prioridad es la asignacion ya que es lo ultimo en ejecutarse, es esta acompañado con sus variantes PREFIJA de adicion, sustraccion, multiplicacion, division o modulo.
		int asignacion = 5;
		asignacion += 3; // 5 + 3 = 8
		asignacion -= 1; // 8 - 1 = 7
		asignacion *= 2; // 7 * 2 = 14
		asignacion /= 7; //14 / 7 = 2
		asignacion %= 1; // 2 % 1 = 0 
		
		System.out.println(asignacion);
		
	}
}
