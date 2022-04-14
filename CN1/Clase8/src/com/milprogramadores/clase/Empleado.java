package com.milprogramadores.clase;

public class Empleado extends Persona {

	private int horasSemanales;

	
	public int getHorasSemanales() {
		return horasSemanales;
	}

	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
	
	public void saludarComoEmpleado() {
		super.saludar();
		System.out.println("Empleado!!!");
	}
	
	public void dimeQuienEres() {
		System.out.println("Soy un empleado");
	}
	
}
