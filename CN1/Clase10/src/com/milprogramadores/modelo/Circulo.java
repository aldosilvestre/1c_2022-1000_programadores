package com.milprogramadores.modelo;

public class Circulo extends Figura{

	private int radio;
	
	public Circulo(int radio) { // new Circulo(<tamaño radio>)
		super(0);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2) ;
	}

}
