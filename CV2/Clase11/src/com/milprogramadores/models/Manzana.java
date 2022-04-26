package com.milprogramadores.models;

public class Manzana extends Fruta{

	public Manzana(double peso) {
		super(peso);
	}
	 
	@Override
	public double hacerJugo() {
		return this.getPeso() * 0.3; // 0.3 == 30% --> ej. 100 * 0.3 = 30
	}
}
