package com.milprogramadores.ejemplo;

public class Resta extends Operacion implements Calculable{

	public Resta(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public void calcular() {
		System.out.println("El resultado de la resta es " + (this.getNumero1() - this.getNumero2()));
	}

}
