package com.milprogramadores.ejemplo;

public class Suma extends Operacion implements Calculable{

	public Suma(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public void calcular() {
		System.out.println("El resultado de la suma es " + (this.getNumero1() + this.getNumero2()));
	}

	
}
