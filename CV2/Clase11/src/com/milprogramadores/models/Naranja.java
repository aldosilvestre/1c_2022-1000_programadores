package com.milprogramadores.models;

public class Naranja extends Fruta{

	public Naranja(double peso) {
		super(peso);
	}

	@Override
	public double hacerJugo() {
		return this.getPeso() * 0.8;
	}

}
