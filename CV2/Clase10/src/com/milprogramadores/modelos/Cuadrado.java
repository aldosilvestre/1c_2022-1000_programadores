package com.milprogramadores.modelos;

public class Cuadrado extends Figura {

	private int tamanioLado;
	
	/** Recibe la longitud del lado.
	 * 
	 * @param longitudLado
	 */
	public Cuadrado(int longitudLado) {
		super(4);
		this.tamanioLado = longitudLado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(tamanioLado, 2) ; // lado^2  --> 5 * 5 = 25 --> 25.0
	}
	
}
