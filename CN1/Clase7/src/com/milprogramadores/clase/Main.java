package com.milprogramadores.clase;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Persona nuevaPersonaConstructorVacio = new Persona();
		
		Persona nuevaPersonaConFullConstructor = new Persona("Aldo", "Silvestre", 32);

		
		
		Persona nuevaPersonaAccessors = new Persona();
		nuevaPersonaAccessors.setNombre("Pepe");
		nuevaPersonaAccessors.setEdad(54);
		
		nuevaPersonaAccessors.getNombre();
		nuevaPersonaAccessors.getEdad();
		
		
		Operacion operacion = new Operacion();
		List<Integer> lista = List.of(1, 3, 4, 10, 12);
		System.out.println(operacion.sumar(lista));
		
	}

}
