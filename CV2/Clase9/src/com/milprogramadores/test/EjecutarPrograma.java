package com.milprogramadores.test;

import com.milprogramadores.dominio.Producto;

/** Ejercicio 7 TP2 POO
 * 
 * @author aldo
 *
 */

public class EjecutarPrograma {

	public static void main(String[] args) {
		
		Producto nuevoProducto = new Producto(Long.valueOf(1), "La Serenisima", "leche", 120.20, 20);
		
		Producto nuevoProducto2= new Producto();
		nuevoProducto2.setId(Long.valueOf(2));
		nuevoProducto2.setNombre("Doritos");
		nuevoProducto2.setCategoria("snacks");
		nuevoProducto2.setPrecio(250.00);
		nuevoProducto2.setStock(50);
		
		nuevoProducto.vender("leche", 10);
		
		nuevoProducto.comprar("leche", 91);
		System.out.println(nuevoProducto.getStock());
		
		nuevoProducto.comprar("leche", 100);
		nuevoProducto.comprar("yerba mate", 10);
		
		
		
		
	}

}
