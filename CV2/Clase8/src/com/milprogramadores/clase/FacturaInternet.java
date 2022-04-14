package com.milprogramadores.clase;

public class FacturaInternet extends FacturaServicio implements Cobrable{

	@Override
	public void cobrar() {
		System.out.println("Se cobro el internet por el monto " + this.getMonto() );
	}

}
