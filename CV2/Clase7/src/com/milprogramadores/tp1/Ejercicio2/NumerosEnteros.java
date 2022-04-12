package com.milprogramadores.tp1.Ejercicio2;

public class NumerosEnteros {

	private double valorNumero;
	
	public NumerosEnteros(double valor) {
		this.valorNumero = valor;
	}
	
	public double suma(NumerosEnteros numero) {
		return this.valorNumero + numero.valorNumero;
	}
	
	public double resta(NumerosEnteros numero) {
		return this.valorNumero - numero.valorNumero;
	}
	
	public double multiplicacion(NumerosEnteros numero) {
		return this.valorNumero * numero.valorNumero;
	}
	
	public double division(NumerosEnteros numero) {
		return this.valorNumero / numero.valorNumero;
	}
}
