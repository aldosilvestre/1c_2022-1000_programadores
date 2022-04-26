package com.milprogramadores.modelo;

public class Mandarina extends Fruta{

	public Mandarina(double peso) {
		super(peso);
	}

	@Override
	public double hacerJugo() {
		return this.getPeso() * 0.7; // 70% === 0.7
	}
	
	
}
