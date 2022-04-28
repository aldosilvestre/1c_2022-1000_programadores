package model.herencia;

import java.time.LocalDate;

public class ProductoEnvasado extends Producto{

	private String tipoEnvasado;
	
	protected ProductoEnvasado(Long _id, LocalDate _fechaVencimiento, String _marca, 
								double _peso, boolean _nacional, String _tipoEnvasado) {
		super(_id, _fechaVencimiento, _marca, _peso, _nacional);
		this.tipoEnvasado = _tipoEnvasado;
	}
	
	public String mostrarDatos() {
		return super.mostrarDatos() + ", tipo envasado: " + this.tipoEnvasado;
	}
	
}
