package com.milprogramadores;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3Arreglos {

	public static void main(String[] args) {
		int[] arreglo = new int[10];
        // [15,2,3,5,10,65,7,56,21,11]
		
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Float> array = new ArrayList<Float>();
		
		for(int i=0; i<10; i++) {
			array.add(scanner.nextFloat());
		}
		
		// TODO: Mostrar el array Original pero en un metodo
		
		
		// TODO: Crear un metodo que lea por teclado la posicion y la elimine
		
		System.out.print("Ingresar una posicion: " );
		Integer posicionAQuitar = scanner.nextInt();
		
		array.remove(posicionAQuitar.intValue());
		array.remove(new Integer(5)); // recibe un Object y quita la primer ocurrencia de lo pasado por parametro
		System.out.println(array);
		
	}

}
