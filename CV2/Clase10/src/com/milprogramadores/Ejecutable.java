package com.milprogramadores;

import java.util.ArrayList;

import com.milprogramadores.modelos.Circulo;
import com.milprogramadores.modelos.Cuadrado;
import com.milprogramadores.modelos.Figura;
import com.milprogramadores.modelos.Triangulo;


/** Ejercicio 2 TP3 POO
 * 
 * @author aldo
 *
 */
public class Ejecutable {

	public static void main(String[] args) {
		
		
		Cuadrado nuevoCuadrado = new Cuadrado(5);
		Circulo nuevoCirculo = new Circulo(7.5);
		Triangulo nuevoTriangulo = new Triangulo(10, 15);
		
		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(nuevoCuadrado);
		figuras.add(nuevoCirculo);
		figuras.add(nuevoTriangulo);
		
		for( Figura unaFigura : figuras) {
			System.out.println(unaFigura.calcularArea());;
		}
		
		
	}

}
