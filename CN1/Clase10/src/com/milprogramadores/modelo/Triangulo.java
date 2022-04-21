package com.milprogramadores.modelo;

public class Triangulo extends Figura{
	
	private int base;
	private int altura;
	
	/** Constructor de un triangulo con la base y la altura
	 * 
	 * @param base
	 * @param altura
	 */
	public Triangulo(int base, int altura) { // new Triangulo(base, altura)
		super(3);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (base*altura) / 2;
	}
	
}
