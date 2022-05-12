package com.milprogramadores;

import java.io.IOException;

public class Ejercicio2 {

	/*
	Escribe un programa que solicite al usuario un valor cualquiera. 
	El programa no dejará de solicitarlo hasta que el usuario introduzca un 
	valor entero (usar: flujo de bytes).
	*/
	public static void main(String[] args){
		// 0 --> 48 y 9 --> 57 ==> [48, 57]
		try {
			int caracter;
			while((caracter = System.in.read()) > -1) {
				if( caracter >= 48 && caracter <= 57) {
					System.out.println(caracter);
					System.out.println("char: " + (char) caracter);
					break;
				}
			}
			System.out.println("FIN...");
		}catch(IOException e) {
			System.out.println("Hubo un error de entrada o salida" + e.getLocalizedMessage());
		}

	}

}
