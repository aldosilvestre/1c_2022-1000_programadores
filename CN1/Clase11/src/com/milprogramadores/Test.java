package com.milprogramadores;

import java.util.ArrayList;

import com.milprogramadores.modelo.Fruta;
import com.milprogramadores.modelo.Mandarina;
import com.milprogramadores.modelo.Manzana;
import com.milprogramadores.modelo.ManzanaRoja;
import com.milprogramadores.modelo.Naranja;
import com.milprogramadores.modelo.Pera;

/** Ejercicio 4 TP 2 POO
 * @author aldo
 */

public class Test {
	/*
	 * En una clase Test crear una colección de Frutas aleatorias (Manzana, Naranja, Pera)
		y mostrar la cantidad de jugo obtenido
	 * 
	 */
	public static void main(String[] args) {
		
		ArrayList<Fruta> frutas = new ArrayList<Fruta>();

		// <Clase> nombreInstancia = new <Clase>(<parametros del constructor>);
		Manzana fruta1 = new Manzana(0.200);
		Naranja fruta2 = new Naranja(0.300);
		Pera fruta3 = new Pera(0.250);
		Manzana fruta4 = new Manzana(0.350);
		Mandarina fruta5 = new Mandarina(0.250);
		
		
		ManzanaRoja fruta6 = new ManzanaRoja(0.100);
		
		
		
		frutas.add(fruta1);
		frutas.add(fruta2);
		frutas.add(fruta3);
		frutas.add(fruta4);
		frutas.add(fruta5);
		frutas.add(fruta6);
		
		double jugoTotal = 0;
		
		for(Fruta frutaDeLaLista : frutas ) {
			jugoTotal += frutaDeLaLista.hacerJugo();
			System.out.println(frutaDeLaLista.hacerJugo());
		}
		System.out.println(jugoTotal);
		
	}

}
