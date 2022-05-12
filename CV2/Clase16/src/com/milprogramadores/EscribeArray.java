package com.milprogramadores;

import java.io.ByteArrayInputStream;

public class EscribeArray {	
	/* Ejercicio 1
	Intenta escribir un programa, de nombre “EscribeArray”, que cree un array de bytes, 
	con los dígitos del 0 al 9, y a continuación, defina sobre él un flujo de entrada 
	para leer sus valores, y mostrarlos por pantalla (usar: ByteArrayInputStream y 
	función available()).

	Ejemplo:
		Entrada: array_1 = [0,1,2,3,4,5,6,7,8,9]
		Salida = 0,1,2,3,4,5,6,7,8,9
	*/
	public static void main(String[] args) {

		byte[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // --> 8 digitos binarios --> 256 numeros --> [0, 255]
		
		ByteArrayInputStream bais = new ByteArrayInputStream(array);
		
		while(bais.available() > 0) {
			System.out.print(bais.read() + ", ");
		}
		System.out.println( );
		System.out.println("FIN.");
	}

}
