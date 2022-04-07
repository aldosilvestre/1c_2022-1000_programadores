package com.milprogramadores;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		
		int matrizEnteros[][] = { {1, 2}, {3, 4}, {5, 6}}; 
		
		// [ [1 2] [3 4] [5 6] ]
		int filas, columnas;
		filas = columnas = 3;
		int matriz[][] = new int[filas][columnas]; // matriz de 3x3 --> 3 listas de 3 elementos cada una
		
		/*
			0 0 0
			0 0 0
			0 0 0
		*/
		imprimir(matriz);
		
		List<String> listaCadena = new ArrayList<String>();
		listaCadena.add("hola");
		listaCadena.add("mundo");
		
		List<String> listaCadena2 = new ArrayList<String>();
		listaCadena2.add("nuevo");
		listaCadena2.add("Sarasa");
		
		List<List<String>> matrizCadena = new ArrayList<List<String>>();
		matrizCadena.add(listaCadena);
		matrizCadena.add(listaCadena2);

		System.out.println(matrizCadena);
		imprimir(matrizCadena);
		
		System.out.println("-----------For each-----------");
		
		// forEach es un bucle que recorre todos los elementos de la lista
		// java 1.7
		// Ej List<List<String>>
		for( List<String> lista : matrizCadena) {
			for( String elemento : lista) {
				System.out.print(elemento + "\t");	
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		// java 1.8
		matrizCadena.stream().forEach( lista -> {
			lista.stream().forEach( elemento -> {
				System.out.print(elemento + "\t");
			});
			System.out.println();
		});
		
		Scanner scanner = new Scanner(System.in);
		int opt = 0;
		while(opt < 5) {
			
			System.out.println("Ingrese un nombre:");
			listaCadena.add(scanner.nextLine());
			
			opt++;
		}
		
		System.out.println(listaCadena);
		
		listaCadena.sort(Comparator.naturalOrder());
		System.out.println(listaCadena);
	}

	private static void imprimir(int[][] matriz) {
		for(int i=0; i < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	private static void imprimir(List<List<String>> matriz) {
		for(int i=0; i < matriz.size(); i++) {
			for(int j=0; j < matriz.get(i).size(); j++) {
				System.out.print(matriz.get(i).get(j) + "\t");
			}
			System.out.println();
		}
	}

}
