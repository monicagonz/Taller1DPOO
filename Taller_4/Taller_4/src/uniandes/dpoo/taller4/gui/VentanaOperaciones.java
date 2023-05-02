package uniandes.dpoo.taller4.gui;
import uniandes.dpoo.taller4.modelo.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JRadioButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Rectangle;
import java.awt.TexturePaint;

import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JList;
import javax.swing.SpinnerListModel;
import javax.swing.UIManager;
import java.awt.Component;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import java.awt.Button;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class VentanaOperaciones extends JFrame implements ActionListener{
//implements ActionListener
	private JPanel contentPane;
	JButton Boton_ReiniciarJ,Boton_Top10,Boton_CargarJugador   ;
	private final ButtonGroup buttonGroupDificultad = new ButtonGroup();
	
	private JButton[][] buttons;
	private int boardSize = 5;
	private int movesCount = 0;
	private int clickedButtonRow;
	private int clickedButtonCol;
	private JPanel gamePanel;
	private JLabel MostrarPuntaje;
    
	
	/**
	 * Create the frame.
	 * 
	 * 
	 */

	public VentanaOperaciones() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 557);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Lights Out");
		setLocationRelativeTo(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 0, 255));
		panel_2.setBounds(350, 11, 304, 61);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Tama\u00F1o:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		panel_2.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15"}));
		panel_2.add(comboBox);
		
		JLabel lblNewLabel_1_1 = new JLabel("Dificultad:");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		panel_2.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("F\u00E1cil");
		buttonGroupDificultad.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		rdbtnNewRadioButton.setBackground(new Color(102, 0, 255));
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMedio = new JRadioButton("Medio");
		buttonGroupDificultad.add(rdbtnMedio);
		rdbtnMedio.setForeground(new Color(0, 0, 0));
		rdbtnMedio.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		rdbtnMedio.setBackground(new Color(102, 0, 255));
		panel_2.add(rdbtnMedio);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Dificil");
		buttonGroupDificultad.add(rdbtnNewRadioButton_1_1);
		rdbtnNewRadioButton_1_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		rdbtnNewRadioButton_1_1.setBackground(new Color(102, 0, 255));
		panel_2.add(rdbtnNewRadioButton_1_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(102, 0, 255));
		panel_2_1.setBounds(463, 83, 191, 424);
		contentPane.add(panel_2_1);
		
		Panel panel_1_1 = new Panel();
		panel_2_1.add(panel_1_1);
		
		JPanel panel_3_3 = new JPanel();
		panel_2_1.add(panel_3_3);
		panel_3_3.setBorder(UIManager.getBorder("Button.border"));
		panel_3_3.setBackground(new Color(127, 255, 0));
		
		JButton Boton_ReiniciarJ_1 = new JButton("         Nuevo        ");
		panel_3_3.add(Boton_ReiniciarJ_1);
		Boton_ReiniciarJ_1.setForeground(new Color(75, 0, 130));
		Boton_ReiniciarJ_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		Boton_ReiniciarJ_1.setBackground(Color.WHITE);
		
		Panel panel_1 = new Panel();
		panel_2_1.add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_2_1.add(panel_3);
		panel_3.setBorder(UIManager.getBorder("Button.border"));
		panel_3.setBackground(new Color(127, 255, 0));
		
		Boton_ReiniciarJ = new JButton("       Reiniciar       ");
		panel_3.add(Boton_ReiniciarJ);
		Boton_ReiniciarJ.addActionListener(this);
		Boton_ReiniciarJ.setBackground(new Color(255, 255, 255));
		Boton_ReiniciarJ.setForeground(new Color(75, 0, 130));
		Boton_ReiniciarJ.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		
		Panel panel_4 = new Panel();
		panel_2_1.add(panel_4);
		
		JPanel panel_3_4 = new JPanel();
		panel_2_1.add(panel_3_4);
		panel_3_4.setBorder(UIManager.getBorder("Button.border"));
		panel_3_4.setBackground(new Color(127, 255, 0));
		
		JButton Boton_Top10 = new JButton("       Top - 10        ");
		Boton_Top10.setForeground(new Color(75, 0, 130));
		Boton_Top10.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		Boton_Top10.setBackground(Color.WHITE);
		panel_3_4.add(Boton_Top10);
		
		Panel panel = new Panel();
		panel_2_1.add(panel);
		
		JPanel panel_3_4_1 = new JPanel();
		panel_2_1.add(panel_3_4_1);
		panel_3_4_1.setBorder(UIManager.getBorder("Button.border"));
		panel_3_4_1.setBackground(new Color(127, 255, 0));
		
		JButton Boton_Top10_2 = new JButton("Cambiar Jugador");
		Boton_Top10_2.setForeground(new Color(75, 0, 130));
		Boton_Top10_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		Boton_Top10_2.setBackground(Color.WHITE);
		panel_3_4_1.add(Boton_Top10_2);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(174, 11, 166, 61);
		contentPane.add(panel_3_1);
		panel_3_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(102, 51, 204), new Color(102, 51, 204), new Color(102, 51, 204), new Color(51, 0, 102)));
		panel_3_1.setBackground(new Color(127, 255, 0));
		
		JLabel lblNickname = new JLabel("Jugador");
		lblNickname.setVerticalAlignment(SwingConstants.TOP);
		lblNickname.setForeground(new Color(51, 0, 102));
		lblNickname.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		panel_3_1.add(lblNickname);
		
		JLabel MostrarNickName = new JLabel("Nombre Jugador");
		MostrarNickName.setForeground(new Color(51, 0, 102));
		MostrarNickName.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		MostrarNickName.setEnabled(false);
		panel_3_1.add(MostrarNickName);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBounds(10, 11, 154, 61);
		contentPane.add(panel_3_2);
		panel_3_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(102, 51, 204), new Color(102, 51, 204), new Color(102, 51, 204), new Color(51, 0, 102)));
		panel_3_2.setBackground(new Color(127, 255, 0));
		
		JLabel lblPuntos = new JLabel("Jugadas");
		lblPuntos.setVerticalAlignment(SwingConstants.TOP);
		lblPuntos.setForeground(new Color(51, 0, 102));
		lblPuntos.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		panel_3_2.add(lblPuntos);
		
		
		
		String n_cadena = String.valueOf(movesCount);
		
		MostrarPuntaje = new JLabel(n_cadena);
		MostrarPuntaje.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		MostrarPuntaje.setForeground(new Color(51, 0, 102));
		MostrarPuntaje.setEnabled(false);
		panel_3_2.add(MostrarPuntaje);
	 
	    
	    JPanel panel_5 = new JPanel();
	    panel_5.setBackground(new Color(51, 0, 102));
	    panel_5.setBounds(10, 83, 443, 424);
	    contentPane.add(panel_5);
	    panel_5.setLayout(null);
	    setVisible(false);
		
		// Crea el panel del juego
        gamePanel = new JPanel(new GridLayout(boardSize, boardSize));
		gamePanel.setBackground(new Color(135, 206, 250));
		gamePanel.setBounds(0, 0, 443, 424);
		panel_5.add(gamePanel);
	    
		buttons = new JButton[boardSize][boardSize];
		
		for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setBackground(Color.BLACK);
                buttons[i][j].setForeground(Color.BLACK);
                buttons[i][j].addActionListener(this);
                gamePanel.add(buttons[i][j]);
            }
        }

        // Agrega el panel del juego a la ventana
        //add(gamePanel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        int buttonRow = -1, buttonCol = -1;

        // Busca el bot�n que ha sido clickeado
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (buttons[i][j] == button) {
                    buttonRow = i;
                    buttonCol = j;
                    break;
                }
            }
        }//

        // Cambia el estado del bot�n y los botones adyacentes
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int row = buttonRow + i;
                int col = buttonCol + j;
                if (row >= 0 && row < boardSize && col >= 0 && col < boardSize) {
                    if (buttons[row][col].getBackground() == Color.BLACK) {
                        buttons[row][col].setBackground(Color.WHITE);
                        buttons[row][col].setForeground(Color.WHITE);
                    } else {
                        buttons[row][col].setBackground(Color.BLACK);
                        buttons[row][col].setForeground(Color.BLACK);
                    }
                }
            }
        }
        
        // Incrementa el contador de movimientos
        
       
        movesCount++;
        MostrarPuntaje.setText(movesCount + "");
        
        

        // Verifica si el jugador ha ganado
        boolean win = true;
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (buttons[i][j].getBackground() == Color.BLACK) {
                    win = false;
                    break;
                }
            }
            if (!win) {
                break;
            }
        }

        if (win) {
            // El jugador ha ganado
            System.out.println("�Ganaste en " + movesCount + " movimientos!");
            // Puedes a�adir aqu� un cuadro de di�logo que muestre el mensaje de victoria
        }
		
	 
       
        
       
//		
//		JButton BottonLuzIn_3_2 = new JButton("");
//		BottonLuzIn_3_2.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/lusdef.PNG")));
//		BottonLuzIn_3_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
//		BottonLuzIn_3_2.setBounds(280, 394, 80, 77);
//		contentPane.add(BottonLuzIn_3_2);
//		
//	
	
	 // Crear un componente personalizado para mostrar la imagen en la figura
	    
       

		
	}
	
	
	

	
}
