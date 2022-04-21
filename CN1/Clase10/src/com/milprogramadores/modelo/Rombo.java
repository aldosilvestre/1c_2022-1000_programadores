package com.milprogramadores.modelo;

public class Rombo extends Figura{

	private int diagonalMenor;
	private int diagonalMayor;
	
	public Rombo(int diaMenor, int diaMayor) {
		super(4);
		this.diagonalMayor = diaMayor;
		this.diagonalMenor = diaMenor;
	}

	@Override
	public double calcularArea() {
		return (this.diagonalMenor * this.diagonalMayor) / 2 ;
	}
	
}
