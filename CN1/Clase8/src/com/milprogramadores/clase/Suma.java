package com.milprogramadores.clase;

public class Suma extends Operacion implements Operar{

	public Suma(int num1, int num2) {
		super(num1, num2);
	}
	
	@Override
	public void calcular() {
		System.out.println(this.num1 + this.num2);
	}

}
