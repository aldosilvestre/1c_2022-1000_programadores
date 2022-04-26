package com.milprogramadores.modelo;

public class ManzanaRoja extends Manzana{

	public ManzanaRoja(double peso) {
		super(peso);
	}

	@Override
	public double hacerJugo() {
		return this.getPeso() * 0.1; // 10% === 0.1
	}
	
}
