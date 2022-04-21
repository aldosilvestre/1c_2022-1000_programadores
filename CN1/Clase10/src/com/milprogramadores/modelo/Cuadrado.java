package com.milprogramadores.modelo;

public class Cuadrado extends Figura{

	private int lado;
	
	/** Se pasa el tamaño del lado
	 * 
	 * @param lado
	 */
	public Cuadrado(int lado) {
		super(4);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return Math.pow(this.lado, 2); // (lado ^ 2)
	}

}
