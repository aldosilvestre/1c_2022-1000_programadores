package com.milprogramadores.modelo;

public abstract class Figura {
	
	private int cantLados;
	
	
	/** Se pasan la cantidad de lados de la figura
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
