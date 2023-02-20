package uniandes.dpoo.taller2.modelo;

public class Pedido {
	
	// attributes
	
	private int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	// constructor

	public Pedido(String nombreCliente,String direccionCliente) {
		
		this.nombreCliente = nombreCliente;
		this.direccionCliente = direccionCliente;
		
	}
	
	// methods 
	
	public int getidPedido() {
		
		return this.idPedido;
	}
	
	//public void agregarProducto(Producto nuevoItem) {
		
	//	}
	
	// private int getPrecioNetoPedido() {
		
    // return PrecioNeto
	//}
	
	//private int getPrecioTotalPedido() {
		
	//}
	
	//private getPrecioIVAPedido() {
		
	//}
	
	//private String generarTextoFactura() {
		
	//}
	
	//public void guardarFactura(File archivo) {
		
	//}
	
	
}
