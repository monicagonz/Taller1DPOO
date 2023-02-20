package uniandes.dpoo.taller2.modelo;


public class Ingrediente {
	
	// attributes

	private String nombre;
	
	private int costoAdicional;
	
	// constructor
	
	public Ingrediente(String Nombre, int CostoAdicional) {
		
		this.nombre = Nombre;
		this.costoAdicional = CostoAdicional;
		
	}
	
	// methods
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public int getCostoAdicional() {
		
		return this.costoAdicional;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCostoAdicional(int costoAdicional) {
		this.costoAdicional = costoAdicional;
	}
}
