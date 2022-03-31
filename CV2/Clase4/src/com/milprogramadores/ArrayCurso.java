package com.milprogramadores;

public class ArrayCurso {

	public static void main(String[] args) {
		
		int[] array = new int[4];
		
		// que contiene el array 0 0 0 0
		// cual indice es        0 1 2 3

		array[2] = 5;
			
		
		//System.out.println(array[2]);
		
		for(int indice=0; indice < array.length; indice++) {
			System.out.print(array[indice] + "\t");
		}
		System.out.println();

		int[] array2 = {1 , 2, 3, 4, 5}; // new int[5]
		String[] arrayString = {"nombre1", "nombre2", "nombre3"};
		System.out.println(arrayString[1]);
	}

}
