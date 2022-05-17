package com.milprogramadores;

public class Ejercicio9 {

	/*
	Ejercicio Nro 9
	Realizar un programa donde se implemente los métodos de una pila (push,
	pop, peek, empty).
	● Definir una pila
	● Mostrar el último elemento ingresado a una pila
	● Mostrar todos los elementos de una pila hasta quedar vacía.
	*/
	public static void main(String[] args) {
		
		Pila<String> nuevaPila = new Pila<>();

		nuevaPila.push("Uno");
		nuevaPila.push("Dos");
		nuevaPila.push("Tres");
		
		String valor = nuevaPila.pop();
		System.out.println(valor);
		
		nuevaPila.peek(); // es mismo que el top()
	
		while(!nuevaPila.empty()) {
			System.out.println(nuevaPila.pop());
		}
	
	}
	
	

}
