package com.milprogramadores;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int iteracion = scanner.nextInt();
		
		String cadena = scanner.next();
		System.out.println(cadena);
		
		
		int contador = 0;
		// Evalua la condicion al inicio
		while(contador < iteracion) { // 0 , 1, 2, 3, 4
			
			System.out.println("mensaje");
			//if(contador == 2) {
			//	break;
			//}
			contador++; // contador = contador + 1
		}
		
		// Evalua la condicion al final
		contador = 0;
		do {
			contador++;
			System.out.println(contador);
		}while(contador < 5);
		

	}

}
