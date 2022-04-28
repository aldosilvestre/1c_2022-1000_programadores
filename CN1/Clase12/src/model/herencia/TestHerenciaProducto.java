package model.herencia;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestHerenciaProducto {

	public static void main(String[] args) {
		
		
		ProductoLacteo leche = new ProductoLacteo(Long.valueOf(123), 
									LocalDate.of(2023, 04, 10), "Mu", 900.0, true, 200.0, 10);
		ProductoLacteo yogurt = new ProductoLacteo(Long.valueOf(124), 
				LocalDate.of(2022, 06, 15), "La serenisima", 1000.0, false, 100.0, 9);
		ProductoLacteo lecheChocolatada = new ProductoLacteo(Long.valueOf(125), 
				LocalDate.of(2022, 12, 18), "La tres marias", 950.0, true, 150.0, 11);
		
		ProductoEnvasado choclo = new ProductoEnvasado(Long.valueOf(126),
				LocalDate.of(2024, 10, 05), "Marolio", 1000.0, true, "caja");
		ProductoEnvasado fideo = new ProductoEnvasado(Long.valueOf(127),
				LocalDate.of(2022, 11, 05), "La paulina", 500.0, true, "bolsa");
		ProductoEnvasado cera = new ProductoEnvasado(Long.valueOf(128),
				LocalDate.of(2024, 12, 26), "bleam", 2000.0, false, "caja");
		
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		productos.add(leche);
		productos.add(fideo);
		productos.add(yogurt);
		productos.add(choclo);
		productos.add(cera);
		productos.add(lecheChocolatada);
		
		for(Producto productoActual: productos) {
			System.out.println(productoActual.mostrarDatos());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
