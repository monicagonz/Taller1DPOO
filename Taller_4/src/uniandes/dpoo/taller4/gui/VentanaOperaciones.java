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

public class VentanaOperaciones extends JFrame implements ActionListener{

	private JPanel contentPane;
	JButton Boton_CargarJugador, boton_Top10, Boton_ReiniciarJ  ;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	
	/**
	 * Create the frame.
	 * 
	 * 
	 */

	public VentanaOperaciones() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 571);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 0, 102));
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Lights Out");
		setLocationRelativeTo(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(102, 0, 204));
		panel_2.setBounds(10, 11, 371, 39);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Tama\u00F1o:");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		panel_2.add(lblNewLabel_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setForeground(new Color(102, 51, 204));
		spinner.setBackground(new Color(102, 51, 204));
		spinner.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		spinner.setModel(new SpinnerListModel(new String[] {"4x4  "}));
		panel_2.add(spinner);
		
		JLabel lblNewLabel_1_1 = new JLabel("Dificultad:");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		panel_2.add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("F\u00E1cil");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton.setSelected(true);
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		rdbtnNewRadioButton.setBackground(new Color(102, 0, 204));
		panel_2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMedio = new JRadioButton("Medio");
		rdbtnMedio.setForeground(new Color(0, 0, 0));
		rdbtnMedio.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		rdbtnMedio.setBackground(new Color(102, 0, 204));
		panel_2.add(rdbtnMedio);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Dificil");
		rdbtnNewRadioButton_1_1.setForeground(new Color(0, 0, 0));
		rdbtnNewRadioButton_1_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
		rdbtnNewRadioButton_1_1.setBackground(new Color(102, 0, 204));
		panel_2.add(rdbtnNewRadioButton_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(UIManager.getBorder("Button.border"));
		panel_3.setBackground(new Color(127, 255, 0));
		panel_3.setBounds(228, 61, 139, 53);
		contentPane.add(panel_3);
		
		
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(102, 51, 204), new Color(102, 51, 204), new Color(102, 51, 204), new Color(51, 0, 102)));
		panel_3_1.setBackground(new Color(127, 255, 0));
		panel_3_1.setBounds(10, 61, 92, 64);
		contentPane.add(panel_3_1);
		
		JLabel lblNickname = new JLabel("Jugador");
		lblNickname.setVerticalAlignment(SwingConstants.TOP);
		lblNickname.setForeground(new Color(51, 0, 102));
		lblNickname.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		panel_3_1.add(lblNickname);
		
		JTextPane Nombre_Jugador = new JTextPane();
		Nombre_Jugador.setText("       Mar     ");
		Nombre_Jugador.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Nombre_Jugador.setBackground(new Color(102, 255, 0));
		panel_3_1.add(Nombre_Jugador);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(102, 51, 204), new Color(102, 51, 204), new Color(102, 51, 204), new Color(51, 0, 102)));
		panel_3_2.setBackground(new Color(127, 255, 0));
		panel_3_2.setBounds(112, 61, 92, 64);
		contentPane.add(panel_3_2);
		
		JLabel lblPuntos = new JLabel("Jugadas");
		lblPuntos.setVerticalAlignment(SwingConstants.TOP);
		lblPuntos.setForeground(new Color(51, 0, 102));
		lblPuntos.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		panel_3_2.add(lblPuntos);
		
		JTextPane Mostrar_Puntos = new JTextPane();
		Mostrar_Puntos.setBackground(new Color(102, 255, 0));
		panel_3_2.add(Mostrar_Puntos);
		Mostrar_Puntos.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		Mostrar_Puntos.setText("     13      ");
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(102, 0, 255));
		panel_2_1.setBounds(10, 473, 371, 48);
		contentPane.add(panel_2_1);
		
		JPanel panel = new JPanel();
		panel_2_1.add(panel);
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(102, 51, 204), new Color(102, 51, 204), new Color(102, 51, 204), new Color(51, 0, 102)));
		panel.setBackground(new Color(127, 255, 0));
		
		
		
		JLabel lblNewLabel_2 = new JLabel("         ");
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setForeground(new Color(51, 0, 102));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		panel_2_1.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(102, 51, 204), new Color(102, 51, 204), new Color(102, 51, 204), new Color(51, 0, 102)));
		panel_1.setBackground(new Color(127, 255, 0));
		panel_2_1.add(panel_1);
		
		// BOTONES
		//
		//
		
		Boton_CargarJugador = new JButton("Cambiar Jugador");
		Boton_CargarJugador.addActionListener(this);
		panel_1.add(Boton_CargarJugador);
		Boton_CargarJugador.setBackground(new Color(255, 245, 238));
		Boton_CargarJugador.setForeground(new Color(75, 0, 130));
		Boton_CargarJugador.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		
		
		boton_Top10 = new JButton("      Top-10      ");
		boton_Top10.addActionListener(this);
		boton_Top10.setForeground(new Color(75, 0, 130));
		boton_Top10.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		panel.add(boton_Top10);
		boton_Top10.setBackground(new Color(255, 250, 250));
		
		
		Boton_ReiniciarJ = new JButton("   Reiniciar    ");
		Boton_ReiniciarJ.addActionListener(this);
		panel_3.add(Boton_ReiniciarJ);
		Boton_ReiniciarJ.setBackground(new Color(255, 255, 255));
		Boton_ReiniciarJ.setForeground(new Color(75, 0, 130));
		Boton_ReiniciarJ.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		
		
	
		
		
		
		

		//Tablero del juego
		
		
	    /**JButton Botonluzout_1 = new JButton("");
		Botonluzout_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		Botonluzout_1.setBounds(10, 130, 80, 77);
		contentPane.add(Botonluzout_1);
		
		JButton Botonluzout_2 = new JButton("");
		Botonluzout_2.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/oscuro3.PNG")));
		Botonluzout_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		Botonluzout_2.setBounds(100, 131, 80, 77);
		contentPane.add(Botonluzout_2);
		
		JButton BottonLuzIn = new JButton("");
		BottonLuzIn.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/lusdef.PNG")));
		BottonLuzIn.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		BottonLuzIn.setBounds(10, 218, 80, 77);
		contentPane.add(BottonLuzIn);
		
		JButton BottonLuzIn_1 = new JButton("");
		BottonLuzIn_1.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/lusdef.PNG")));
		BottonLuzIn_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		BottonLuzIn_1.setBounds(190, 131, 80, 77);
		contentPane.add(BottonLuzIn_1);
		
		JButton BottonLuzIn_2 = new JButton("");
		BottonLuzIn_2.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/lusdef.PNG")));
		BottonLuzIn_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		BottonLuzIn_2.setBounds(100, 219, 80, 77);
		contentPane.add(BottonLuzIn_2);
		
		JButton Botonluzout_2_1 = new JButton("");
		Botonluzout_2_1.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/oscuro3.PNG")));
		Botonluzout_2_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		Botonluzout_2_1.setBounds(190, 218, 80, 77);
		contentPane.add(Botonluzout_2_1);
		
		JButton Botonluzout_2_2 = new JButton("");
		Botonluzout_2_2.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/oscuro3.PNG")));
		Botonluzout_2_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		Botonluzout_2_2.setBounds(280, 130, 80, 77);
		contentPane.add(Botonluzout_2_2);
		
		JButton Botonluzout_2_3 = new JButton("");
		Botonluzout_2_3.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/oscuro3.PNG")));
		Botonluzout_2_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		Botonluzout_2_3.setBounds(280, 218, 80, 77);
		contentPane.add(Botonluzout_2_3);
		
		JButton BottonLuzIn_3 = new JButton("");
		BottonLuzIn_3.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/lusdef.PNG")));
		BottonLuzIn_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		BottonLuzIn_3.setBounds(10, 306, 80, 77);
		contentPane.add(BottonLuzIn_3);
		
		JButton BottonLuzIn_4 = new JButton("");
		BottonLuzIn_4.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/lusdef.PNG")));
		BottonLuzIn_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		BottonLuzIn_4.setBounds(100, 306, 80, 77);
		contentPane.add(BottonLuzIn_4);
		
		JButton BottonLuzIn_5 = new JButton("");
		BottonLuzIn_5.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/lusdef.PNG")));
		BottonLuzIn_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		BottonLuzIn_5.setBounds(280, 306, 80, 77);
		contentPane.add(BottonLuzIn_5);
		
		JButton Botonluzout_2_1_1 = new JButton("");
		Botonluzout_2_1_1.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/oscuro3.PNG")));
		Botonluzout_2_1_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		Botonluzout_2_1_1.setBounds(190, 306, 80, 77);
		contentPane.add(Botonluzout_2_1_1);
		
		JButton Botonluzout_2_1_1_1 = new JButton("");
		Botonluzout_2_1_1_1.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/oscuro3.PNG")));
		Botonluzout_2_1_1_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		Botonluzout_2_1_1_1.setBounds(10, 394, 80, 77);
		contentPane.add(Botonluzout_2_1_1_1);
		
		JButton Botonluzout_2_1_1_2 = new JButton("");
		Botonluzout_2_1_1_2.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/oscuro3.PNG")));
		Botonluzout_2_1_1_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		Botonluzout_2_1_1_2.setBounds(100, 394, 80, 77);
		contentPane.add(Botonluzout_2_1_1_2);
		
		JButton BottonLuzIn_3_1 = new JButton("");
		BottonLuzIn_3_1.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/oscuro3.PNG")));
		BottonLuzIn_3_1.setBorder(null);
		BottonLuzIn_3_1.setBounds(190, 394, 80, 77);
		contentPane.add(BottonLuzIn_3_1);
		
		JButton BottonLuzIn_3_2 = new JButton("");
		BottonLuzIn_3_2.setIcon(new ImageIcon(VentanaOperaciones.class.getResource("/imagenes/lusdef.PNG")));
		BottonLuzIn_3_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		BottonLuzIn_3_2.setBounds(280, 394, 80, 77);
		contentPane.add(BottonLuzIn_3_2);
		
		**/
	
		
		
	}
	
	
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		try {
			BufferedImage luz_in = ImageIO.read(this.getClass().getResource("lusdef.PNG"));
			TexturePaint textura = new TexturePaint(luz_in, new Rectangle(91,91));
			g2d.setPaint(textura);
			g2d.fillRoundRect(20,20,89,89,25,25);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(Boton_CargarJugador == e.getSource()) {
			
			
			
		}
		if(boton_Top10 == e.getSource()) {
			
			File archivo = new File("data/top10.csv");
			
			Top10 cargar_jugadores = new Top10();
			
			cargar_jugadores.cargarRecords(archivo);
			
			
			
		}
		if(Boton_ReiniciarJ == e.getSource()) {
			
		}
		
	}
}
