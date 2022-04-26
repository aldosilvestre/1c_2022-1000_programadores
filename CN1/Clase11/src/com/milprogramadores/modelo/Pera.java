package com.milprogramadores.modelo;

public class Pera extends Fruta{

	public Pera(double peso) {
		super(peso);
	}

	@Override
	public double hacerJugo() {
		return this.getPeso() * 0.6;
	}

}
