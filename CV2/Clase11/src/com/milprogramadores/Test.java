package com.milprogramadores;

import java.util.ArrayList;

import com.milprogramadores.models.Fruta;
import com.milprogramadores.models.Manzana;
import com.milprogramadores.models.Naranja;
import com.milprogramadores.models.Pera;

// autoimport ctrl + shift + o

public class Test {

	/*
	En una clase Test crear una colección de Frutas aleatorias 
	(Manzana, Naranja, Pera)
	y mostrar la cantidad de jugo obtenido
	*/
	public static void main(String[] args) {
		
		Manzana fruta1 = new Manzana(0.200);
		Naranja fruta2 = new Naranja(0.300);
		Pera fruta3 = new Pera(0.150);
		Manzana fruta4 = new Manzana(0.250);
		
		ArrayList<Fruta> frutas = new ArrayList<Fruta>();
		frutas.add(fruta1);
		frutas.add(fruta2);
		frutas.add(fruta3);
		frutas.add(fruta4);
		
		double cantJugo = 0;
		for(Fruta frutaActual : frutas) {
			cantJugo += frutaActual.hacerJugo();
			System.out.println(frutaActual.hacerJugo());
		}
		
		System.out.println(cantJugo);
	}

}
