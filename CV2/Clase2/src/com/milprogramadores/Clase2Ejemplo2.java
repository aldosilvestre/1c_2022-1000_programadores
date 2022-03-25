package com.milprogramadores;

/** Ejemplo para tipos de datos en java
 * 
 * @author aldos
 *
 */
public class Clase2Ejemplo2 {
	
	public static void main(String[] args) {
		// 1 byte = 8 bits --> con 8 bits puedo representar 2^8 numeros decimales 
		
		int soyUnEntero = 4; // posee 4 bytes con lo cual su numero maximo es de 2^31 : (2^31 - 1) es decir un valor total de 2^32 valores sin signo
		long soyUnLong = 4; // posee las mismas caracteristicas que un int pero duplicando su valor en bytes, con lo que aumenta el valor maximo y minimo que puede almacenar.
		short soyUnShor = 4; // es un entero pero de 2 bytes
		
		
		float soyUnFloat = 4; // Es para expresar decimales, utiliza 4 bytes y es precision simple.
		double soyUnDouble = 4; // Es del doble de precision que el 'float', es decir, 8 bytes.
		
		
		byte soyUnByte = 0; // basicamente es la unidad de medida, se usa mas para datos o archivos.
		
		
		char soyUnChar = 'a'; // Usan el ansii unicode con lo cual tienen su traduccion en hexa y decimal. Es por ello que puedo almacenar ambos
		char soyUnCharHexa = 0x0061; // --> la letra 'a' en unicode hexa
		char soyUnCharDecimal = 97; // --> es la 'a' pero en decimal, es la conversion del hexadecimal a decimal (0x0061 a 97)  
		
		
		boolean soyUnBoolean = true; // Representan un valor de verdad ya sea true o false
		
		String cadena = "Hola"; // Soy un tipo de dato especial, una lista de 'char' y como tal puedo separarme como 4 char distintos {'H','o','l','a'}
		System.out.println( cadena.charAt(1)); // charAt() trae el char en la posicion que se indica, siempre las listas inician en la posicion 0.
	}
}
