package com.milprogramadores;

import java.util.Stack;

public class Pila<T> {

	private Stack<T> valores;
	
	public Pila() {
		valores = new Stack<>();
	}
	
	public void push(T valor) {
		this.valores.push(valor);
	}
	
	public T pop() {
		return this.valores.pop();
	}
	
	public T peek() {
		return this.valores.peek();
	}
	
	public Boolean empty() {
		return this.valores.empty();
	}
	
	public void mostrarValores() {
		
		for(T valor : this.valores) {
			System.out.println(valor);
		}
		
	}
	
	public void mostrarYVaciar() {
		while(!this.valores.empty()) {
			System.out.println(this.valores.pop());
		}
	}
	
}
