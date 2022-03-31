package com.milprogramadores;

import java.util.ArrayList;

public class ArrayListCurso {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(3);
		lista.add(10);
		lista.add(7);
		
		System.out.println(lista);
		System.out.println(lista.get(0));
		
		ArrayList<String> listaS = new ArrayList<String>();
		listaS.add("asdfas");
		listaS.add("nombre2");
	
		
		System.out.println("Inicio for");
		for(int indice = 0; indice < lista.size(); indice++) {
			System.out.println(lista.get(indice));
		}
		
		// foreach de Java 7 
		System.out.println("Con foreach java 7");
		for(int valor : lista) {
			System.out.println(valor);
		}
		
		// foreach de Java 8
		System.out.println("Con foreach java 8");
		lista.stream().forEach( valor -> {
			System.out.println(valor);
		});
		
		
	}

}
