package com.milprogramadores.clase;

import java.util.List;

public class Operacion {

	
	public int sumar(int a, int b) {
		return a + b;
	}
	
	public int sumar(int a, int b, int c) {
		return a + b + c;
	}
	
	public int sumar(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	public int sumar(List<Integer> lista) {
		int resultado = 0;
		for(Integer numero : lista) {
			resultado += numero;
		}
		return resultado;
	}
	
}
