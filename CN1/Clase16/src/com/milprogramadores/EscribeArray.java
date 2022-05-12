package com.milprogramadores;

import java.io.ByteArrayInputStream;

// Ejercicio 1 TP Entrada/Salida
public class EscribeArray {

	/**
	 * Intenta escribir un programa, de nombre “EscribeArray”, que cree un array de
		bytes, con los dígitos del 0 al 9, y a continuación, defina sobre él un flujo de entrada
		para leer sus valores, y mostrarlos por pantalla (usar: ByteArrayInputStream y
		función available())
	 */
	public static void main(String[] args) {
		
		byte[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		
		ByteArrayInputStream lectorPorByte = new ByteArrayInputStream(array); 
		
		//bais.available(); // --> cantidad de bytes que tengo por leer.
		//bais.read(); // --> leer el byte que me devuelve y pasar al siguiente.
	
		for(; 0 < lectorPorByte.available();) {
			System.out.print(lectorPorByte.read() + ", ");
		}

	}

}
