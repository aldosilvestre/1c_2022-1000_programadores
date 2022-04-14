package com.milprogramadores.clase;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object cadena = new String("hola");
		
		Alumno alumno = new Alumno("Aldo", "Silvestre", "A");
		Empleado empleado = new Empleado();
		
		empleado.setFechaNacimiento(LocalDate.of(1987, 05, 23));
		
		Domicilio domicilio = new Domicilio();
		domicilio.setCalle("calle");
		domicilio.setNumero(123);
		
		empleado.setDomicilio(domicilio);
		
		//System.out.println(alumno.getNombre());
		//System.out.println(alumno.getComision());
		
		//alumno.saludarComoPersona();
		//empleado.saludarComoEmpleado();
		
		List<Persona> personas = List.of(alumno, empleado);
		
		
		for(Persona persona : personas) {
			persona.dimeQuienEres();
		}
		
		Tarjeta tarjeta = new Tarjeta();
		Debito debito = new Debito();
		
		List<Venta> ventas = List.of(tarjeta, debito);
		
		for(Venta venta : ventas) {
			venta.cobrar();
		}
		
		Suma suma1 = new Suma(5, 3);
		Suma suma2 = new Suma(15, 30);
		Suma suma3 = new Suma(2, 8);
		
		Resta resta1 = new Resta(5, 3);
		Resta resta2 = new Resta(15, 3);
		Resta resta3 = new Resta(0, 3);
		
		List<Operar> listaOperaciones = List.of(suma1, suma2, suma3, resta1, resta2, resta3);
		
		for(Operar operacion : listaOperaciones) {
			operacion.calcular();
		}
		
	}

}
