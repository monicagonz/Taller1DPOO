package co.edu.uniandes.graphics.gui;

import javax.swing.JFrame;

import java.awt.color.*;

public class InterfazPrincipal extends JFrame{
	

	public InterfazPrincipal(){
		
		setTitle("Nueva Ventana");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700, 700);
		setVisible(true);
	}	
		
		public static void main(String[] args) {
			
			new InterfazPrincipal();
	}
		
		
	
}
