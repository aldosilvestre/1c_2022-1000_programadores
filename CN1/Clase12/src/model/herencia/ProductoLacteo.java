package model.herencia;

import java.time.LocalDate;

public class ProductoLacteo extends Producto{

	private double cantidadLeche;
	private int temperaturaRefrigeracion;
	
	public ProductoLacteo(Long _id, LocalDate _fechaVencimiento, String _marca, 
							double _peso, boolean _nacional, double _cantidadLeche, 
							int _temperaturaRefrigeracion) {
		super(_id, _fechaVencimiento, _marca, _peso, _nacional);
		this.cantidadLeche = _cantidadLeche;
		this.temperaturaRefrigeracion = _temperaturaRefrigeracion;
	}

	public String mostrarDatos() {
		// id: 123, fecha vencimiento: 2023-04-27, marca: Mu, peso: 900gr, ¿es nacional?: true 
		// cantidad leche: 300 ml, temperatura refrigeración: 10 grados centigrados
		return super.mostrarDatos() + ", cantidad leche: " + this.cantidadLeche + "ml, temperatura refrigeración: " + this.temperaturaRefrigeracion + " grados centigrados";
	}
	
	
}
