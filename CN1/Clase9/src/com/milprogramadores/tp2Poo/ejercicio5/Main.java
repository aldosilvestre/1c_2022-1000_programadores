package com.milprogramadores.tp2Poo.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		1 - Crear una agenda que tendra el espacio que definamos al inicio.
		2 - En la agenda deberiamos poder guardar, borrar.
		3 - Imprimir cuando la agenda es completa.
		4 - Buscar un contacto por el nombre y devolver el numero.
		5 - Listar los contactos e imprimirlos. 
		*/
		

		
		boolean salir = false;
		Scanner scanner = new Scanner(System.in);
		int tamanioAgenda;
		
		System.out.print("Quiere definir el tamaño de la agenda (Si / No ): " );
		String eleccion = scanner.nextLine();
		if(eleccion.equals("Si")) {
			tamanioAgenda = scanner.nextInt();
		}else {
			tamanioAgenda = 10;
		}
		
		Agenda agenda = new Agenda(tamanioAgenda);
		
		while(!salir) { // for (;<condicional>;) es igual a un while(<condicional>)
			
			System.out.print("Ingrese la opcion: ");
			int opcion = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcion) {
			case 1:
				System.out.println("Agregar un contacto");
				Contacto nuevoContacto = new Contacto();
				System.out.print("Ingrese el Nombre: ");
				nuevoContacto.setNombre(scanner.nextLine());
				System.out.print("Ingrese el Numero: ");
				nuevoContacto.setNumero(scanner.nextLong());
				
				agenda.aniadirContacto(nuevoContacto);
				break;
			case 2:
				System.out.println("Borrar un contacto");
				System.out.print("Ingrese el Nombre a eliminar: ");
				String nombre = scanner.nextLine();
				
				agenda.eliminiarContacto(nombre);
				break;
			case 3:
				System.out.println("Buscar un contacto");
				System.out.print("Ingrese el Nombre a buscar: ");
				String nombreABuscar = scanner.nextLine();
				
				Contacto encontrado = agenda.buscarContacto(nombreABuscar);
				if(encontrado != null) {
					System.out.println(encontrado.getNumero());
				}else {
					System.out.println("Contacto no encontrado");
				}
				break;
			case 4:
				System.out.println("Lista contactos");
				agenda.listarContactos();
				break;
			case 5:
				System.out.println("Contactos libres");
				agenda.contactosLibres();
				break;
			case 0:
				salir = true;
				System.out.println("Muchas Gracias");
				break;
			default:
				System.out.println("Opciones disponibles --> Agregar: 1 | Borrar: 2 | Buscar: 3 | Listar: 4 | Contactos Libres: 5 | Salir: 0");
				break;
			}
			
		}
		scanner.close();
	}
	
}
