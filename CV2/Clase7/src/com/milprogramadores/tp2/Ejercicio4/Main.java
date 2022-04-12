package com.milprogramadores.tp2.Ejercicio4;

import java.time.LocalDate;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * Crear una clase Productos con atributos: Nombre, precios, vencimiento, con 2 
		 * tipos de productos perecederos y no perecederos.
		 * Crear sus constructores getters y setters.
		 * crear una función llamada calcular: en producto simplemente seria calcular 
		 * precio por cantidad, en perecederos el precio se reducirá según los días a 
		 * caducar, si le queda 1 día se reducirá 4 veces el precio, si le quedan 2 días 
		 * se reducirá el precio 3 veces, si le quedan 3 días se reducirá la mitad el precio. 
		 * Crear una clase ejecutable y crear un array de productos y muestra el precio 
		 * total de vender 5 productos de cada uno.
		 */
		
		Producto producto1 = new Producto(); 
		producto1.setNombre("Mayonesa");
		producto1.setPrecio(50.50);
		producto1.setVencimiento(LocalDate.of(2022, 04, 28));
		producto1.setPerecedero(true);
		
		Producto producto2 = new Producto("Savora", 100.25, LocalDate.of(2022, 04, 20), true);
		Producto producto3 = new Producto("Champignon", 50, LocalDate.of(2025, 04, 19), false);
		Producto producto4 = new Producto("leche", 90, LocalDate.of(2022, 04, 14), true);
		Producto producto5 = new Producto("Carne", 900, LocalDate.of(2022, 04, 13), true);
		
		List<Producto> productos = List.of(producto1, producto2, producto3, producto4, producto5);
		
		double precioTotal = 0;
		// 50.5 + 100.25 + 50 + 30 + 225 = 455.75
		for(Producto producto : productos) {
			precioTotal += producto.calcularPrecio();
		}
		
		System.out.println(precioTotal);
	}

}
