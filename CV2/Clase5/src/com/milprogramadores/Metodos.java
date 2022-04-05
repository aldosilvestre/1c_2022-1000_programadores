package com.milprogramadores;

public class Metodos {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		int resultado = multiplicacion(x, y);
		System.out.println(resultado);

		String nombre = "Aldo";
		String segundoNombre = "Gabriel";
		String apellido = "Silvestre";
		
		imprimirNombreCompleto(nombre, segundoNombre, apellido);
		
	}

	
	public static int multiplicacion(int nro1, int nro2) {
		return nro1 * nro2;
	}
	
	public static void imprimirNombreCompleto(String n, String sn, String a) {
		System.out.println("El nombre completo es: " + n + " " + sn + " " + a);
	}
	
}
