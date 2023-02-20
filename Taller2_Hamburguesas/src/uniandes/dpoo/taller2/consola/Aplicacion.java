package uniandes.dpoo.taller2.consola;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.List;
import uniandes.dpoo.taller2.procesamiento.Restaurante;

public class Aplicacion {
	
	private Restaurante calculadora;
	
	public void ejecutarAplicacion() {
		
		System.out.println("Hamburgueseria \n");
		
		boolean bandera =  true;
		while(bandera) {
			
			mostrarMenu();
			
			int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
			if (opcion_seleccionada == 1)
				cargarInformacionRestaurante();
			else if (opcion_seleccionada == 2 && calculadora  != null)
				iniciarPedido();
			else if (opcion_seleccionada == 3 && calculadora != null)
				//idk ;(
			else if (opcion_seleccionada == 4 && calculadora != null)
				cerrarYGuardarPedido();
			else if (opcion_seleccionada == 5 && calculadora != null)
				getidPedido()
			**/
		}
	}
	
	public void mostrarMenu() {
		
		System.out.println("\n Opciones de la aplicación \n");
		System.out.println("1. Mostrara el menu");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Agregar un elemento a un pedido");
		System.out.println("4. Cerrar un pedido y guardar la factura");
		System.out.println("5. Consultar la información de un pedido dado su id");
	}

	public static void main(String[] args) {
		
		Aplicacion consola = new Aplicacion();
		
		consola.ejecutarAplicacion();
				
		
	}
}
