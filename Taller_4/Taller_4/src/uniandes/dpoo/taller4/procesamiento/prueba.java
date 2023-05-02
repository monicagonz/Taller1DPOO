package uniandes.dpoo.taller4.procesamiento;

import javax.swing.JFrame;
import javax.swing.JPanel;

import uniandes.dpoo.taller4.gui.Casillas_tab;

import java.awt.BorderLayout;

public class prueba extends JFrame {
    public prueba() {
        Casillas_tab panel = new Casillas_tab();
        getContentPane().add(panel, BorderLayout.CENTER);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new prueba();
    }
}
