package uniandes.dpoo.taller2.procesamiento;

import uniandes.dpoo.taller2.modelo.Combo;
import uniandes.dpoo.taller2.modelo.Ingrediente;
import uniandes.dpoo.taller2.modelo.Producto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uniandes.dpoo.taller2.consola.Aplicacion;
import uniandes.dpoo.taller2.modelo.Pedido;




public class Restaurante {
	
	private ArrayList <Producto> productos;
	private ArrayList <Ingrediente> ingredientes;
	private ArrayList <Combo> combos;
	

		
		
   public void cargarinformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos ) {
				
				
				
		productos = new ArrayList <Producto>();
		ingredientes = new ArrayList <Ingrediente>();
		combos = new ArrayList <Combo>();
				
		try {
					
			  cargarIngredientes("./data/ingredientes.csv");
			  cargarMenu("./data/menu.csv");
			  cargarCombos("./data/combos.csv");
					
			}
				
			catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		
		}




	private void cargarIngredientes(String nombre) throws IOException {
		
		
		
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		while(linea!=null) {
			
			String [] datos = linea.split(";");
			String nombreIngrediente = datos[0];
			int precioIngrediente = Integer.parseInt(datos[1].trim());
			
			Ingrediente nuevo = Ingrediente(nombreIngrediente, precioIngrediente);
			ingredientes.add(nuevo);
			
			}
		    lector.close();
			
		}
		


	private Ingrediente Ingrediente(String nombreIngrediente, int precioIngrediente) {
		// TODO Auto-generated method stub
		Ingrediente nuevo = Ingrediente(nombreIngrediente, precioIngrediente);
		ingredientes.add(nuevo);
		
		return null;
	}




	private void cargarMenu(String nombre)throws IOException {
		
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		
		while(linea!=null) {
			
			String [] datos = linea.split(";");
			String nombreProducto = datos[0];
			int precioProducto = Integer.parseInt(datos[1].trim());
			
			Producto nuevo = Productos(nombreProducto, precioProducto);
			productos.add(nuevo);
			}
		 	lector.close();
			
		}
		
	private Producto Productos(String nombreProducto, int precioProducto) {
		// TODO Auto-generated method stub
		Producto nuevo = Productos(nombreProducto, precioProducto);
		productos.add(nuevo);
		return null;
	}




	private void cargarCombos(String nombre)throws IOException {
		
		File archivo = new File(nombre);
		BufferedReader lector = new BufferedReader(new FileReader(archivo));
		String linea = lector.readLine();
		
		while(linea!=null) {
			
			String [] datos = linea.split(";");
			String nombreCombo = datos[0];
			int porcentajeDescuento = Integer.parseInt(datos[1].trim());
			String hamburguesa = datos[2];
			String papas = datos [3];
			String bebida = datos[4];
			
			
			Combo nuevo = Combo(nombreCombo, porcentajeDescuento, hamburguesa, papas, bebida);
			combos.add(nuevo);
			
		 }
		 lector.close();
			
	 }
	
	
	
	private Combo Combo(String nombreCombo, int porcentajeDescuento, String hamburguesa, String papas, String bebida) {
		// TODO Auto-generated method stub
		Combo nuevo = Combo(nombreCombo, porcentajeDescuento, hamburguesa, papas, bebida);
		combos.add(nuevo);
		return null;
	}




	public static void main(String[] args) {
		
		for (Ingrediente c: ingredientes) {
				System.out.println(c.getNombre());
			}
		
	}
			
}
