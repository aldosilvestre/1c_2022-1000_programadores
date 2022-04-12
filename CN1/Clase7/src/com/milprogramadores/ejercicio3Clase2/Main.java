package com.milprogramadores.ejercicio3Clase2;

import com.milprogramadores.clase.Persona;

public class Main {

	public static void main(String[] args) {
		/*
		 * Usando la clase persona del ejercicio 1 crear una clase empleado que deberá 
		 * tener el atributo sueldo básico. Implementar los métodos:
		 * 
		 * calculoSueldo(): este se calcula como la cantidad de horas trabajadas por el 
		 * sueldo básico
		 * 
		 * verEmpleado(): visualiza los datos del empleado.
		 */

		Persona personaEmpleado = new Persona();
		personaEmpleado.setNombre("Daniel");
		personaEmpleado.setApellido("Rosales");
		personaEmpleado.setEdad(27);
		
		
		Empleado empleado = new Empleado();
		empleado.setSueldoBasico(40000);
		empleado.setHorasTrabajadas(160);
		empleado.setPersona(personaEmpleado);
		
		double sueldoTotal = empleado.calculoSueldo();
		System.out.println(sueldoTotal);
		
		System.out.println(empleado.verEmpleado());
	}

}
