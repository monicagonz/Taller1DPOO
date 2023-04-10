package co.edu.uniandes.graphics.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class PanelLienzo extends JPanel{

	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		Rectangle2D.Double rectangle = 
				new Rectangle2D.Double(0,0,400,400);
		
		g2d.draw(rectangle);
		g2d.fill(rectangle);
		
		Ellipse2D.Double elipse = 
				new Ellipse2D.Double()
				
	}
	
}
