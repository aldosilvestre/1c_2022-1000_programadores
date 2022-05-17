package com.milprogramadores;

import java.util.Stack;

public class Pila<T> {

	private Stack<T> pila;
	
	public Pila() {
		pila = new Stack<T>();
	}
	
	public void push(T valor) {
		pila.add(valor);
	}
	
	public T pop() {
		return pila.pop();
	}
	
	public Boolean empty() {
		return pila.isEmpty();
	}
	
	public T peek() {
		return pila.peek();
	}
	
}
