package com.milprogramadores;

public class Ejemplo {

	public static void main(String[] args) {
		
		// "123321" --> 123 == 321
		
		int nro = 123321;
		
		String cadena = String.valueOf(nro);
		
		String  str = cadena.substring(0, cadena.length() / 2);
		String  str2 = cadena.substring(cadena.length() / 2, cadena.length());
		
		
		System.out.println(str);
		System.out.println(str2);
	}
	
}
