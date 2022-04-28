package model.herencia;

import java.time.LocalDate;

public class Producto {

	private Long id;
	private LocalDate fechaVencimiento; // formato -> 2022-04-27
	private String marca;
	private double peso;
	private boolean nacional;
	
	protected Producto(Long _id, LocalDate _fechaVencimiento, String _marca, double _peso, boolean _nacional) {
		this.id = _id;
		this.fechaVencimiento = _fechaVencimiento;
		this.marca = _marca;
		this.peso = _peso;
		this.nacional = _nacional;
	}

	public String mostrarDatos() {
		// id: 123, fecha vencimiento: 2023-04-27, marca: Mu, peso: 900gr, ¿es nacional?: true 
		return "id: " + this.id + ", fecha vencimiento: " + this.fechaVencimiento
				+ ", marca: " + this.marca + ", peso: " + this.peso + "gr, ¿es nacional?: " 
				+ this.nacional; 
	}

}
