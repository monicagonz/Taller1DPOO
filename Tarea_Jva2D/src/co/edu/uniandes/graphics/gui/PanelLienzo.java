package co.edu.uniandes.graphics.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class PanelLienzo extends JPanel{

	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		Rectangle2D.Double rectangle = 
				new Rectangle2D.Double(0,0,700,700);
		
		g2d.setColor(Color.cyan);
		g2d.draw(rectangle);
		g2d.fill(rectangle);
		
		
		Ellipse2D.Double elipse = 
				new Ellipse2D.Double(350,30,100,100);
		
		
		g2d.setColor(Color.black);
		g2d.draw(elipse);
		g2d.fill(elipse);
		
		
		
		Ellipse2D.Double copa_s = 
				new Ellipse2D.Double(350,20,100,60);
		
		
		g2d.setColor(Color.MAGENTA);
		g2d.draw(copa_s);
		g2d.fill(copa_s);
		
		
		
		RoundRectangle2D.Double sombrero_e = 
				new RoundRectangle2D.Double(345,40,106,10,8,8);
		
		g2d.draw(sombrero_e);
		g2d.fill(sombrero_e);	
		g2d.setColor(Color.MAGENTA);
		
		
		int [] arrx = {315,345,450,480};
		int [] arry = {80,50,50,80};
		
		Polygon sombrero_ala2 =
				new Polygon(arrx, arry, 4);
		
		
		g2d.draw(sombrero_ala2);
		g2d.fill(sombrero_ala2);
		g2d.setColor(Color.black);
		
		RoundRectangle2D.Double recredondo = 
				new RoundRectangle2D.Double(320,170,25,180,20,20);
		
		
		
		g2d.draw(recredondo);
		g2d.fill(recredondo);	
		g2d.setColor(Color.black);
		
		
		RoundRectangle2D.Double recredondo2 = 
				new RoundRectangle2D.Double(455,170,25,180,20,20);
		
		
		
		g2d.draw(recredondo2);
		g2d.fill(recredondo2);
		g2d.setColor(Color.black);
		
		
		Rectangle2D.Double rectangle2 = 
				new Rectangle2D.Double(390,130,20,40);
		
		
		
		g2d.draw(rectangle2);
		g2d.fill(rectangle2);
		g2d.setColor(Color.black);
		
		
		Rectangle2D.Double rectangle3 = 
				new Rectangle2D.Double(335,170,130,40);
		
		
		
		g2d.draw(rectangle3);
		g2d.fill(rectangle3);
		g2d.setColor(Color.black);
		
		
		Rectangle2D.Double rectangle4 = 
				new Rectangle2D.Double(360,170,80,180);
		
		
		
		g2d.draw(rectangle4);
		g2d.fill(rectangle4);
		g2d.setColor(Color.cyan);
		
		
		RoundRectangle2D.Double recredondo3 = 
				new RoundRectangle2D.Double(345,200,15,40,20,20);
		
		
		g2d.draw(recredondo3);
		g2d.fill(recredondo3);
		g2d.setColor(Color.cyan);
		
		
		RoundRectangle2D.Double recredondo4 = 
				new RoundRectangle2D.Double(440,200,15,40,20,20);
		
		
		g2d.draw(recredondo4);
		g2d.fill(recredondo4);
		g2d.setColor(Color.black);
		
		
		RoundRectangle2D.Double recredondo5 = 
				new RoundRectangle2D.Double(360,330,35,180,20,20);
		
		g2d.setColor(Color.black);
		g2d.draw(recredondo5);
		g2d.fill(recredondo5);
		
		
		
		RoundRectangle2D.Double recredondo6 = 
				new RoundRectangle2D.Double(405,330,35,180,20,20);
		
		g2d.setColor(Color.black);
		g2d.draw(recredondo6);
		g2d.fill(recredondo6);
	
		
		
		int [] arrX = {230,250,550,570};
		int [] arrY = {550,500,500,550};
		
		Polygon fig =
				new Polygon(arrX, arrY, 4);
		
		
		g2d.setColor(Color.black);
		g2d.draw(fig);
		g2d.fill(fig);
		
		//Parte_2
		
		g.setColor(Color.orange);
		g.drawOval(50,50,100,100);
		g.fillOval(50,50,100,100);
		
		
		//Parte_3
		
		
		Rectangle2D.Double cuadrado = 
				new Rectangle2D.Double(90,350,100,100);
		
		g2d.setColor(Color.yellow);
		g2d.draw(cuadrado);
		g2d.fill(cuadrado);
		
		
		g.setColor(Color.cyan);
		g.drawOval(30,390,100,100);
		g.fillOval(30,390,100,100);
		
		
		g.setColor(Color.cyan);
		g.drawOval(30,291,100,100);
		g.fillOval(30,291,100,100);
		
		g.setColor(Color.cyan);
		g.drawOval(129,388,100,100);
		g.fillOval(129,388,100,100);
		
		
		g.setColor(Color.cyan);
		g.drawOval(129,291,100,100);
		g.fillOval(129,291,100,100);
		
		
		
		
	}
	
}
