package com.milprogramadores;

public class Verctor {

	public static void main(String[] args) {
		
		int[] arreglo = new int[3];
		
		// Al inicializar el valor por defecto de los valores internos es 0
		
		arreglo[0] = 15;
		arreglo[1] = 20;
		arreglo[2] = 34;
		

		for(int indice = 0; indice < arreglo.length; indice++) {
			System.out.println("En la posicion " + indice +" esta el valor " + arreglo[indice]);
		}
		
		// arreglo[4] = 20;  --> no es posible por que sale del tamaño del array
		
		String[] arregloDeString = {"Nombre1", "Nombre2", "Nombre3", "Nombre4"};
		
		for(int indice = 0; indice < arregloDeString.length; indice++) {
			System.out.println("En la posicion " + indice +" esta el valor " + arregloDeString[indice]);
		}
		
		// arregloDeString[10] = "asdfsd"; --> No se puede
		
		
		int[] listaEnteros = {1,1,1}; // tamaño de 3 elementos
	}

}
