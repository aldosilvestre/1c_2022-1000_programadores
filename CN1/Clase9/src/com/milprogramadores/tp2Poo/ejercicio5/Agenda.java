package com.milprogramadores.tp2Poo.ejercicio5;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Contacto> contactos;
	private int tamanioAgenda;

	public Agenda() {
		this.contactos = new ArrayList<Contacto>(); // antes NULL , ahora []
	}

	public Agenda(int tamanio) {
		this.contactos = new ArrayList<Contacto>();
		this.tamanioAgenda = tamanio;
	}

	public void aniadirContacto(Contacto nuevo) {
		if(this.contactos.size() == this.tamanioAgenda) {
			System.out.println("AGENDA LLENA, NO PUEDE INGRESAR MAS CONTACTOS !!!");
			return;
		}
		
		if (this.existeContacto(nuevo)) {
			System.out.println("No se guardo por que ya existe");
			return;
		}
		this.contactos.add(nuevo);
	}

	private boolean existeContacto(Contacto nuevo) {
		for (int index = 0; index < this.contactos.size(); index++) {
			if (this.getContactos().get(index).getNombre().equals(nuevo.getNombre())) {
				return true;
			}
		}
		return false;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public int getTamanioAgenda() {
		return tamanioAgenda;
	}

	public void setTamanioAgenda(int tamanioAgenda) {
		this.tamanioAgenda = tamanioAgenda;
	}

	public void listarContactos() {
		for (Contacto contacto : this.contactos) {
			System.out.println("Nombre: " + contacto.getNombre() + " Telefono: " + contacto.getNumero());
		}

	}

	public void eliminiarContacto(String nombreAEliminar) {

		for (int index = 0; index < this.contactos.size(); index++) {

			if (this.getContactos().get(index).getNombre().equals(nombreAEliminar)) {
				Contacto contactoEliminado = this.contactos.remove(index);
				System.out.println("Se ha eliminado a :" + contactoEliminado.getNombre());
				return;
			}

		}
		System.out.println("No hay un contacto con ese nombre para eliminar");

	}

	public Contacto buscarContacto(String nombreABuscar) {
		for (int index = 0; index < this.contactos.size(); index++) {
			if (this.getContactos().get(index).getNombre().equals(nombreABuscar)) {
				return this.getContactos().get(index);
			}
		}
		return null;
	}
	
	public boolean agendaLlena() {
		return this.contactos.size() >= this.tamanioAgenda; 
	}
	
	public void contactosLibres() {
		System.out.println("El espacio disponible en la agenda es: " + ( this.tamanioAgenda - this.contactos.size() ));
		
	}

}
