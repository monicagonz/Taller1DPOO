package uniandes.dpoo.taller4.gui;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.TexturePaint;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;


   public class Casillas_tab  extends JPanel{

	    private BufferedImage imagen;
	    
   public void cargarImagen() {
	        try {
	            
	            imagen = ImageIO.read(new File("data/luz in.jpg"));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	    
   public void paintComponent(Graphics g) {
	   
	   super.paintComponent(g);
	   
	   Graphics2D g2d =  (Graphics2D) g;
	   Rectangle rectangulo = new Rectangle(50,50,50,50);
	   
	   
	   g2d.fill(rectangulo);
	   g2d.setColor(Color.black);
	   
	    Rectangle areaTextura = new Rectangle(50, 50, imagen.getWidth(),imagen.getHeight());
	    TexturePaint textura = new TexturePaint(imagen, areaTextura);
	    
	    // Aplicar textura al rectangulo 
	    
	    
	    g2d.setPaint(textura);
	    g2d.fill(rectangulo);
	    
	  }
   
  
	   
	}

		


