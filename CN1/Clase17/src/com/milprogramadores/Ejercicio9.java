package com.milprogramadores;

public class Ejercicio9 {

	/*
	Realizar un programa donde se implemente los métodos de  una 
	pila (push, pop, peek, empty).
	Definir una pila
	Mostrar el último elemento ingresado a una pila
	Mostrar todos los elementos de una pila hasta quedar vacía.
	*/
	public static void main(String[] args) {
		
		Pila<Integer> pila = new Pila<Integer>();
		
		pila.push(1);
		pila.push(2);
		pila.push(3);

		pila.mostrarValores();
		
		System.out.println(pila.peek()); // va a obtener el valor del tope de la pila sin borrarlo
		
		pila.pop();
		
		System.out.println(pila.empty());
		
		pila.mostrarValores();
		
		pila.mostrarYVaciar();
		
		System.out.println(pila.empty());
	}

}
