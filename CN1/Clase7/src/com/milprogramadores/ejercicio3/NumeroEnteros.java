package com.milprogramadores.ejercicio3;

public class NumeroEnteros {

	private int numero;
	
	public NumeroEnteros(int numero) {
		this.numero = numero;
	}
	
	
	public int suma(NumeroEnteros numeroASumar) {
		return this.numero + numeroASumar.numero;
	}
	
	public int resta(NumeroEnteros numeroARestar) {
		return this.numero - numeroARestar.numero;
	}
	
	public int multiplicacion() {
		return this.numero;
	}
	
	public int division() {
		return this.numero;
	}
	
}
