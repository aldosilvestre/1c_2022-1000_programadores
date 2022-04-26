package com.milprogramadores.modelo;

public class Naranja extends Fruta{

	public Naranja(double peso) {
		super(peso);
	}

	@Override
	public double hacerJugo() {
		return this.getPeso() * 0.8;
	}

}
