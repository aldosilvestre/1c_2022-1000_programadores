package com.milprogramadores;

import java.util.ArrayList;

import com.milprogramadores.modelo.Circulo;
import com.milprogramadores.modelo.Cuadrado;
import com.milprogramadores.modelo.Figura;
import com.milprogramadores.modelo.Rombo;
import com.milprogramadores.modelo.Triangulo;

/** Este es el ejercicio 2 del TP3 de POO
 * @author aldo
 */
public class Principal {

	public static void main(String[] args) {
		
		Cuadrado nuevoCuadrado = new Cuadrado(5);
		Triangulo nuevoTriangulo = new Triangulo(10, 15);
		Circulo nuevoCirculo = new Circulo(7);
		Rombo nuevoRombo = new Rombo(10, 15);
		
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(nuevoCuadrado);
		figuras.add(nuevoTriangulo);
		figuras.add(nuevoCirculo);
		figuras.add(nuevoRombo);
		
		for(Figura figuraActual : figuras) {
			System.out.println(figuraActual.calcularArea());
		}
		
		
	}

}
