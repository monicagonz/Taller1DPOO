package uniandes.dpoo.taller2.modelo;

public class Combo {
	
	// Attributes
	
	private double descuento;
	
	private String nombreCombo;
	
	// Constructor
	
	public Combo(String nombre, double descuento) {
		
		this.nombreCombo = nombre;
		this.descuento =  descuento;
		
	}
	
	// Methods
	
	//public void agregarItemaCombo(Producto ItemCombo) {
		
	//}
	
	//public getPrecio() {
		
	// shit to for in a list of the combo
	//}
	
	public String generarTextoFactura() {
		
		String factura = "";// unfinished
		
		return factura;
	}
	
	public String getNombre() {
		
		return this.nombreCombo;
	}
}
