package com.milprogramadores.modelo;

public abstract class Fruta {
	
	private double peso;
	
	public Fruta(double peso) {
		this.setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public abstract double hacerJugo();
	
}
