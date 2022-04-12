package com.milprogramadores.ejercicio3Clase2;

import com.milprogramadores.clase.Persona;

public class Empleado {

	private double sueldoBasico;
	private int horasTrabajadas;
	private Persona persona;

	public double calculoSueldo() {
		return sueldoBasico * horasTrabajadas;
	}
	
	public String verEmpleado() {
		return persona.getNombre() + " " + persona.getApellido() + " " + persona.getEdad();
	}
	
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}
	
	
}
