package com.milprogramadores.ejemplo;

public class Multiplicacion extends Operacion implements Calculable{

	public Multiplicacion(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	public void calcular() {
		System.out.println("El resultado de la multiplicacion es " + (this.getNumero1() * this.getNumero2()));
	}

}
