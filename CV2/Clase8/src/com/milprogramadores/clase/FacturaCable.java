package com.milprogramadores.clase;

public class FacturaCable extends FacturaServicio implements Cobrable {

	@Override
	public void cobrar() {
		System.out.println("Se cobro el cable por el monto " + this.getMonto());
	}

}
