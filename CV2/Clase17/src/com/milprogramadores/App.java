package com.milprogramadores;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class App {

	public static void main(String[] args) {
		
		System.out.println("--- LISTA --- ");
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Uno");
		lista.add("Dos");
		lista.add("Tres");
		
		lista.add(1, "Cuatro");
		
		Iterator<String> iterar = lista.iterator();
		
		while(iterar.hasNext()) {
			System.out.println(iterar.next());
		}
		
		System.out.println("----");
		
		for(String valor: lista) {
			System.out.println(valor);			
		}
		
		System.out.println("--- COLAS ---");
		
		Queue<String> cola = new LinkedList<>();
		
		cola.add("Uno");
		cola.add("Dos");
		cola.add("Tres");
		
		cola.add("Cuatro");
		
		System.out.println(cola.peek());
		System.out.println(cola);
		
		while(!cola.isEmpty()) {
			System.out.println(cola.poll());
		}
		
		System.out.println("--- PILA ---");
		
		Stack<String> pila = new Stack<>();
		
		pila.push("Uno");
		pila.push("Dos");
		pila.push("Tres");
		pila.push("Cuatro");
		
		while(!pila.isEmpty()) {
			System.out.println(pila.pop());
		}
	
	}

}
