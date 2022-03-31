package com.milprogramadores;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEjemplos {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(1);
		lista.add(25);
		lista.add(0);
		
		lista.remove(1);
		
		System.out.println(lista);
		
		ArrayList<String> listaString = new ArrayList<String>();
		
		listaString.add("nom y app");
		listaString.add("asdfasd");
		listaString.add("edad");
		
		System.out.println(listaString);

		List<String> listaString2 = List.of("nom1", "nom2");
		List<String> listaString3 = new ArrayList<String>();
		listaString3.add("nom3");
		
		System.out.println(listaString2);
		System.out.println(listaString3);
		
		//System.out.println(listaString.get(1));
		
		for(int indice = 0; indice < lista.size(); indice++) {
			System.out.println(listaString.get(indice));
		}
		
		System.out.println("Como foreach");
		// Java 7
		for(String valor: listaString) {
			System.out.println(valor);
		}
		
		System.out.println("Como foreach java 8");
		// Java 8
		listaString.stream().forEach( valor -> {
			System.out.println(valor);
		});
		
		
	}

}
