package com.milprogramadores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class App {

	public static void main(String[] args) {
		
		System.out.println("--- LISTAS ---");
		
		List<String> lista = new ArrayList<String>();
		
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Tres");
		
		lista.add(1, "Cuatro");
		
		System.out.println(lista);
		
		for(String cadena : lista) {
			System.out.println(cadena);
		}
		
		Iterator<String> iterable = lista.iterator();
		
		while(iterable.hasNext()) {
			System.out.println(iterable.next());
		}
		
		System.out.println("--- COLA ---");
		
		Queue<String> cola = new LinkedList<String>();
		
		cola.add("Uno");
		cola.add("Dos");
		cola.add("Tres");
	
		System.out.println(cola);
		System.out.println(cola.poll());
		System.out.println(cola);
		
		cola.add("Cuatro");
		
		while(!cola.isEmpty()) {
			System.out.println(cola.poll());
		}
		
		System.out.println("--- PILA ---");
		
		Stack<String> pila = new Stack<>();
		
		pila.push("Uno");
		pila.push("Dos");
		pila.push("Tres");
		
		System.out.println(pila);
		
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
		
	}

}
