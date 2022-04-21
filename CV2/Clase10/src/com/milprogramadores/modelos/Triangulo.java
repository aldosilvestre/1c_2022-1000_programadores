package com.milprogramadores.modelos;

public class Triangulo extends Figura {

	private int base;
	private int altura;
	
	/** Contructor de un triangulo
	 * 
	 * @param base - int
	 * @param altura - int 
	 */
	public Triangulo(int base, int altura) {
		super(3);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (this.base * this.altura) / 2;
	}
	
}
