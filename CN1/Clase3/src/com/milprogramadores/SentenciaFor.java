package com.milprogramadores;

public class SentenciaFor {

	public static void main(String[] args) {
		
		for(int contador = 0; contador < 10; contador+=2) {
			System.out.println(contador);
		}
		
		
		/* El unico valor que puede ser necesario es la condicion y de esa forma
		 * se comporta como un while
		 */
		for(int indice=0;indice < 10;indice++) {
			
			if(indice%2 == 0) {
				System.out.println("Es par : "+ indice);
			}else {
				System.out.println("Es impar: "+ indice);
			}
		}
		
		int factorial = 5;
		int valor = 0;
		// 5! = 1*2*3*4*5 = 120
		for(int indice=1; indice<=factorial; indice++) {
			if(indice == 1) {
				valor = 1;
			}else {
				valor *= indice;
			}
		}
		System.out.println(valor);
		
	}

}
