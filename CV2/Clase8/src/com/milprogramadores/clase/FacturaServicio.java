package com.milprogramadores.clase;

import java.time.LocalDate;

public class FacturaServicio {

	private double monto;
	private LocalDate fechaVencimiento;
	
	
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(LocalDate fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	
	
}
