package com.milprogramadores;

public class EntradaSystemIn {

	public static void main(String[] args) throws Exception{
		
		int caracter = 0;
		
		while( (caracter = System.in.read()) != '\n' ) { // 1 byte -> 256 -> [0 , 255] 
			
			System.out.println("El caracter entero es: " + caracter);
			System.out.println("El caracter fue: " + (char) caracter );
		}
		
		System.out.println("Finalizo!");
	}

}
