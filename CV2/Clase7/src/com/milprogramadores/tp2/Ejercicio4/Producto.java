package com.milprogramadores.tp2.Ejercicio4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Producto {

	private String nombre;
	private double precio;
	private LocalDate vencimiento; // 2022-04-12
	private boolean perecedero;
	
	public Producto() {}
	
	public Producto(String nombre, double precio, LocalDate fechaVencimiento, boolean esPerecedero) {
		this.nombre = nombre;
		this.precio = precio;
		this.vencimiento = fechaVencimiento;
		this.perecedero = esPerecedero;
	}
	
	public double calcularPrecio() {
		LocalDate fechaActual = LocalDate.now(); 
		int diasAVencer = (int) fechaActual.until(this.vencimiento, ChronoUnit.DAYS);
		
		if(this.perecedero) {
			if(diasAVencer == 1) {
				return this.precio / 4;
			}else if(diasAVencer == 2) {
				return this.precio / 3;
			}else if(diasAVencer == 3) {
				return this.precio / 2;
			}else if(diasAVencer > 3){
				return this.precio;
			}else {
				return 0;
			}
		}else {
			return this.precio;
		}
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public LocalDate getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(LocalDate vencimiento) {
		this.vencimiento = vencimiento;
	}

	public boolean isPerecedero() {
		return perecedero;
	}

	public void setPerecedero(boolean perecedero) {
		this.perecedero = perecedero;
	}
	
	
	
}
