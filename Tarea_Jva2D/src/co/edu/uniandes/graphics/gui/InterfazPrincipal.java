package co.edu.uniandes.graphics.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.color.*;

public class InterfazPrincipal extends JFrame{
	

	@SuppressWarnings("unused")
	private static final long serialVERSIONUID = 1L;
	private JPanel contentPane;
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		PanelLienzo pn = new PanelLienzo();
		jf.add(pn);
		jf.setSize(700, 700);
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}
		
		
	
}
