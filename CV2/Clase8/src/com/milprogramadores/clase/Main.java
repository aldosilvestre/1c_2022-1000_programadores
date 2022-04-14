package com.milprogramadores.clase;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Alumno nuevoAlumno = new Alumno("Aldo", "Silvestre", 5);
		Empleado nuevoEmpleado = new Empleado("Jose", "Sanchez", 50);

		System.out.println(nuevoAlumno.saludarComoAlumno());
		System.out.println(nuevoEmpleado.saludarComoEmpleado());
		
		Domicilio domicilio = new Domicilio();
		domicilio.setCalle("Colon");
		domicilio.setNumero(123);
		
		nuevoAlumno.setDomicilio(domicilio);
		
		System.out.println("++++++++++++++++++++++");
		
		List<Persona> personas = List.of(nuevoAlumno, nuevoEmpleado);
		
		for(Persona persona : personas) {
			persona.dimeAlgo();
		}
		
		System.out.println("++++++++++++++++++++++++");
		
		FacturaInternet internet = new FacturaInternet();
		internet.setMonto(3200.5);
		FacturaCable cable = new FacturaCable();
		cable.setMonto(2185.25);
		
		List<Cobrable> facturas = List.of(internet, cable);
		
		for(Cobrable factura : facturas) {
			factura.cobrar();
		}
		
		
	}

}
