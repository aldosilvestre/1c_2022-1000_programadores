package com.milprogramadores.clase;

public class Empleado extends Persona {

	private int horasTrabajadas;
	
	public Empleado(String nombre, String apellido, int horas) {
		super(nombre, apellido);
		this.horasTrabajadas = horas;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public String saludarComoEmpleado() {
		return super.saludar() + " soy un empleado";
	}
	
	
	public void dimeAlgo() {
		System.out.println("Trabajo como empleado");
	}
	
	
}
