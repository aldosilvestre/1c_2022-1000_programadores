package com.milprogramadores;

public class SentenciaWhile {

	public static void main(String[] args) {
		int contador = 0;
		// Prueba que la condicion sea verdadera
		while(contador < 5) {
			System.out.println("hola");
			contador++; // contador = contador + 1
		}
		
		System.out.println("-------------");
		// Prueba que la condicion se cumpla al final
		contador = 0;
		do {
			contador++;
			System.out.println("adios");
		}while(contador < 5);
		
	}

}
