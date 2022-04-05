package com.milprogramadores;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1Arreglos {

	public static void main(String[] args) {
	/*
	 * Crear un array de 10 de números enteros, con valores solicitados 
	 * por teclado. Mostrar por consola el índice y el valor de cada 
	 * elemento. Realizar dos métodos, uno para el ingreso de datos y 
	 * otro para la salida de datos
	 */
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++) {
			agregarDato(array, scanner);
		}
		imprimir(array);
		scanner.close();
	}
	
	public static void agregarDato(ArrayList<Integer> lista, Scanner scanner) {
		int valorIngresado = scanner.nextInt();
		lista.add(valorIngresado);
	}
	
	public static void imprimir(ArrayList<Integer> listaNumeros) {
		for(int indice = 0; indice < listaNumeros.size(); indice++) {
			System.out.println("El indice es " + indice + " con valor " + listaNumeros.get(indice));
		}
	}

}
