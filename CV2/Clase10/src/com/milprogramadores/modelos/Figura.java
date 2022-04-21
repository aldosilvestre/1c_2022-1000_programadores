package com.milprogramadores.modelos;

public abstract class Figura {

	private int cantLados;
	
	/** Este constructor instancia un objeto a partir de su cantidad de lados
	 * 
	 * @param cantLados
	 */
	protected Figura(int cantLados) {
		this.cantLados = cantLados;
	}
	
	public abstract double calcularArea();
	
	public int getCantLados() {
		return this.cantLados;
	}
	
}
