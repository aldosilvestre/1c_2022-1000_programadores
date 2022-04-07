package com.milprogramadores;

import java.util.ArrayList;
import java.util.List;

public class Matrices {

	public static void main(String[] args) {
		// filas y columnas
		
		int vector[][] = new int[3][3]; //
		
		int[] columna = {3, 4};
		
		vector[0] = columna; // vector[0][0] = 3 y tambien vector[0][1] = 4
		
		System.out.println(vector[0][1]);
		
		// fila0 -> [ [columna0], [columna1], [columna2] ]
		// fila1 -> [ [columna0], [columna1], [columna2 ]
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		ArrayList<ArrayList<Integer>> matrizArrayList = new ArrayList<ArrayList<Integer>>();
		
		
		
		matrizArrayList.add(lista);
		
		char[] cadena = new char[4];
		cadena[0]='h';
		cadena[1]='o';
		cadena[2]='l';
		cadena[3]='a';
		
		System.out.println(String.valueOf(cadena));
		
		
		ArrayList<String> listaCadenas = new ArrayList<String>();
		listaCadenas.add("Hola");
		listaCadenas.add("Mundo");
		
		ArrayList<String> listaCadenas2 = new ArrayList<String>();
		listaCadenas2.add("Nuevo");
		listaCadenas2.add("Sarasa");
		
		
		ArrayList<ArrayList<String> > matrizArrayListString = new ArrayList<ArrayList<String> >();
		
		matrizArrayListString.add(listaCadenas);
		matrizArrayListString.add(listaCadenas2);
		
		System.out.println(matrizArrayListString);
		
		System.out.println("----------------------");
		
		for(int i=0; i < matrizArrayListString.size(); i++) {
			for(int j=0; j < matrizArrayListString.get(i).size(); j++) {
				System.out.print( matrizArrayListString.get(i).get(j) + "\t");
			}
			System.out.println();
		}
		
		System.out.println("------------ for each ------------");
		
		// Foreach --> Recorre cada elemento de la lista
		// Java 1.7
		for( List<String> listaString : matrizArrayListString) {
			for(String elemento : listaString) {
				System.out.print(elemento + "\t");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		// Java 1.8
		matrizArrayListString.forEach( listaS -> {
			listaS.forEach( elemento -> System.out.print( elemento + "\t"));
			System.out.println();
		});
	}
	
}
