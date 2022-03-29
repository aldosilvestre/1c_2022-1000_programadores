package com.milprogramadores;

public class CicloFor {

	public static void main(String[] args) {
		
		
		int maximo = 5;
		
		for(int inicializador = 0; inicializador < maximo; inicializador++) {
			System.out.println("hola");
		}
		
		System.out.println("Salio del ciclo");
		
		int contador = 0;
		
		for(;contador < 5;) {
			System.out.println("mensaje2");
			contador++;
		}
		
		//Ejemplo
		for(int i = 0; i < 10; i+=3 /* i = i + 3 */) {
			System.out.println(i);
		}
		
	}

}
