package com.milprogramadores.clase;

public class Tarjeta implements Venta{

	@Override
	public void cobrar() {
		System.out.println("cobrado por tarjeta");
	}

}
