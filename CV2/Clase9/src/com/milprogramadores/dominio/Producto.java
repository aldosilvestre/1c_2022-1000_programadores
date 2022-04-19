package com.milprogramadores.dominio;

public class Producto {

	private Long id;
	private String nombre;
	private String categoria;
	private double precio;
	private int stock;
	
	
	public Producto() {}
	
	/** Full constructor Product
	 * 
	 * @param id - Long
	 * @param nombre - String
	 * @param categoria - String
	 * @param precio - double
	 * @param stock - int
	 */
	public Producto(Long id, String nombre, String categoria, double precio, int stock) {
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String validarStock() {
		if(this.stock > 0) {
			return "Tiene Stock";
		}
		return "No tiene Stock";
	}
	
	public void vender(String categoria, int cant) {
		if(categoria.equals(this.getCategoria())) {
			if(this.validarStock().equals("Tiene Stock")) {
				int cantAVender = 0;
				if(this.getStock() >= cant) {
					cantAVender = cant;
					this.setStock(this.getStock() - cant);
				}else {
					cantAVender = this.getStock();
					this.setStock(0);
				}
				double totalAPagar = this.getPrecio() * cantAVender;
				System.out.println("El total a pagar es: " + totalAPagar);
				System.out.println("El stock restante es: " + this.getStock());
				
			}else {
				System.out.println("Error, no tiene stock!");
			}
		}else {
			System.out.println("Error, no es la misma categoria.");
		}
		
	}
	
	public void comprar(String categoria, int cant) {
		if(categoria.equals(this.getCategoria())) {
			if(this.getStock() <= 100 ) {
				this.setStock( this.getStock() + cant );
			}else {
				System.out.println("Tiene suficiente stock, no se realizo la compra");
			}
		}else {
			System.out.println("Categoria equivocada, no se efectuo la compra.");
		}
		
	}
	
}
