
public class Heladera extends Electrodomestico{

	private int capacidad;
	private String color;
	private boolean esFrost;
	private boolean industriaArg;
	
	public Heladera(String marca, double precio, String color) {
		super.setMarca(marca);
		super.setPrecio(precio);
		this.color = color;
	}
	
	public int getCapacidad() {
		
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public String getColor() {
		
		this.decirHola();
		
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isEsFrost() {
		return esFrost;
	}
	public void setEsFrost(boolean esFrost) {
		this.esFrost = esFrost;
	}
	public boolean isIndustriaArg() {
		return industriaArg;
	}
	public void setIndustriaArg(boolean industriaArg) {
		this.industriaArg = industriaArg;
	}
	
	private void decirHola() {
		System.out.println("Hola");
	}
	
}
