package com.milprogramadores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntradaInputStream {

	public static void main(String[] args) throws IOException {
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		int valor = 0;
		
		while( (valor = isr.read()) != '\n' ) {
			
			System.out.println("caracter entero: " + valor);
			System.out.println("caracter: " + (char) valor);
		}
		
		System.out.println("Fin...");
		
		BufferedReader bufferReader = new BufferedReader(isr);
		
		String cadena = bufferReader.readLine();
		
		System.out.println("lo escrito es: " + cadena);
		
	}

}
