package com.milprogramadores.clase;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Persona nuevaPersona = new Persona("Aldo", "Silvestre", 32);
		
		System.out.println(nuevaPersona.getNombre());
		// setter
		nuevaPersona.setNombre("Gabriel");
		// getter
		String suNombre = nuevaPersona.getNombre();

		System.out.println(suNombre);
		
		nuevaPersona.respirar();
		nuevaPersona.imprimirDatos();
		
		System.out.println("------------------------");
		
		Operacion op = new Operacion();
		
		
		System.out.println(op.sumar(3, 2));
		System.out.println(op.sumar(1, 3, 454));
		System.out.println(op.sumar(5, 3, 15, 4));
		
		List<Integer> lista = List.of(1, 5, 7, 11);
		System.out.println(op.sumar(lista));
		
		
		
	}

}
