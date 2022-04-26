package com.milprogramadores.modelo;

public class Manzana extends Fruta{

	public Manzana(double peso) {
		super(peso);
	}

	@Override
	public double hacerJugo() {
		return this.getPeso() * 0.3; // 30% === 0.3
	}
	
}
