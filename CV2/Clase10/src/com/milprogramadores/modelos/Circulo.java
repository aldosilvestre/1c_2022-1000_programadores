package com.milprogramadores.modelos;

public class Circulo extends Figura {

	private double radio;
	
	/** Se recibe en el constructor el radio
	 * 
	 * @param radio
	 */
	public Circulo(double radio) {
		super(0);
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(this.radio, 2); // pi*radio^2
	}
	
}
