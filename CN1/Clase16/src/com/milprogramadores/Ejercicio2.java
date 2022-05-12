package com.milprogramadores;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	/*
	Escribe un programa que solicite al usuario un valor entero. El programa no
	dejará de solicitarlo hasta que el método introduzca un valor entero 
	(usar: flujo de bytes).
	*/
	public static void main(String[] args) throws IOException {
		
		// 0 -> 48, 1 -> 49, 2 -> 50, 3 -> 51, 4 -> 52, 5 -> 53, 6 -> 54, 7 -> 55
		// 8 -> 56, 9 -> 57
		
		int valor;

		while( (valor = System.in.read()) > -1) {
			if( valor >= 48 && valor <= 57) { // [48, 57] => numeros
				System.out.println("valor numerico: " + valor);
				System.out.println("unicode: " + (char) valor);
				break;
			}
			
		}
		System.out.println("Salio del while.");
		
	}

}
