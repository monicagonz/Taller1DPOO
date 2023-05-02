package uniandes.dpoo.taller4.procesamiento;
import javax.swing.*;
import java.awt.EventQueue;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JInternalFrame;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JRadioButtonMenuItem;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.JSplitPane;
import java.awt.Panel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;

/*
 * 
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
*/


///INICIO TEMPLATE - JP
/*
public class SymmetricalImageMatrix extends JPanel {
  // Tama�o de la ventana
  private final int windowSize = 800;

  // Tama�o de la imagen
  private final int imageSize = 100;

  // N�mero de filas y columnas
  private final int rows = windowSize / imageSize;
  private final int cols = windowSize / imageSize;

  // Matriz para almacenar las im�genes
  private BufferedImage[][] images = new BufferedImage[rows][cols];

  // Imagen sim�trica
  private BufferedImage symmetricalImage = new BufferedImage(windowSize, windowSize, BufferedImage.TYPE_INT_ARGB);

  public SymmetricalImageMatrix() {
    // Obtiene el contexto gr�fico de la imagen sim�trica
    Graphics2D g2d = symmetricalImage.createGraphics();

    // Dibuja la matriz sim�trica
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        // Calcula la posici�n de la imagen
        int x = col * imageSize;
        int y = row * imageSize;

        // Crea una nueva imagen con el tama�o actual
        BufferedImage image = new BufferedImage(imageSize, imageSize, BufferedImage.TYPE_INT_ARGB);

        // Dibuja algo en la imagen (por ejemplo, un rect�ngulo relleno de color)
        Graphics2D g2dImage = image.createGraphics();
        g2dImage.setColor(Color.RED);
        g2dImage.fillRect(0, 0, imageSize, imageSize);
        g2dImage.dispose();

        // Guarda la imagen en la matriz
        images[row][col] = image;

        // Copia la imagen en la posici�n actual
        g2d.drawImage(image, x, y, null);
      }
    }

    // Agrega un MouseListener al panel
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        // Obtiene la posici�n del clic del mouse
        int mouseX = e.getX();
        int mouseY = e.getY();

        // Calcula la fila y la columna en la que se hizo clic
        int row = mouseY / imageSize;
        int col = mouseX / imageSize;

        // Obtiene la imagen que se encuentra en la fila y la columna
        BufferedImage clickedImage = images[row][col];

        // Realiza alguna acci�n con la imagen (por ejemplo, cambia su color)
        Graphics2D g2dImage = clickedImage.createGraphics();
        g2dImage.setColor(Color.BLUE);
        g2dImage.fillRect(0, 0, imageSize, imageSize);
        g2dImage.dispose();

        // Redibuja la matriz sim�trica en el lienzo
        repaint();
      }
    });
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    // Dibuja la matriz sim�trica en el lienzo
    g.drawImage(symmetricalImage, 0, 0, null);
  }

  public Dimension getPreferredSize() {
    return new Dimension(windowSize, windowSize);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Symmetrical Image Matrix");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new SymmetricalImageMatrix());
    frame.pack();
    frame.setVisible(true);
  }
}
*/
///FIN TEMPLATE
 /*
 */


public class ventanajuego extends JFrame implements ActionListener{

	
	private static final long serialVersionUID = 1L;
	private JPanel panelPrincipal;
	
	/*
	 * 
	 * CHATGPT RECOM STRT
	 * 
	 */
	
    /*
	 * 
	 * CHATGPT RECOM FIN
	 * 
	 */
    
	
	private final ButtonGroup buttonMenuGroup = new ButtonGroup();
	private final ButtonGroup buttonDificultadGroup = new ButtonGroup();
	
	///DEFINIR CONSTANTES
	private JButton[][] buttons;
	private int boardSize = 5;
	private int movesCount = 0;
	private int clickedButtonRow;
	private int clickedButtonCol;
	private JPanel gamePanel;
	/**
	 * Create the frame.
	 */
	public ventanajuego() {
		setResizable(true);
		setTitle("Juego Lights Out");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 610);
		
        
		panelPrincipal = new JPanel();
		
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		panelPrincipal.setLayout(null);
		
		
		// Crea el panel del juego
        gamePanel = new JPanel(new GridLayout(boardSize, boardSize));
		gamePanel.setBackground(new Color(135, 206, 250));
		gamePanel.setBounds(0, 33, 500, 500);
		panelPrincipal.add(gamePanel);
		
		
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
        add(gamePanel);

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
    

		
		////TODO
		/*
		for (int i = 0; i < boardSize; i++) {
		    for (int j = 0; j < boardSize; j++) {
		        buttons[i][j] = new JButton();
		        gamePanel.add(buttons[i][j]);
		    }
		}
		
		for (int i = -1; i <= 1; i++) {
		    for (int j = -1; j <= 1; j++) {
		        if (i != 0 || j != 0) {
		            int row = clickedButtonRow + i;
		            int col = clickedButtonCol + j;
		            if (row >= 0 && row < 5 && col >= 0 && col < 5) {
		                if (buttons[row][col].getText().equals("")) {
		                    buttons[row][col].setText("X");
		                } else {
		                    buttons[row][col].setText("");
		                }
		            }
		        }
		    }
		}
		
		for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < 5; j++) {
		        final int row = i;
		        final int col = j;
		        buttons[i][j].addActionListener(new ActionListener() {
		            public void actionPerformed(ActionEvent e) {
		                // TODO Implementa aqu� la l�gica del juego
		            }
		        });
		    }
		}
		*/

		
		JPanel panelJugador = new JPanel();
		panelJugador.setBackground(new Color(32, 178, 170));
		panelJugador.setBounds(0, 532, 634, 52);
		panelPrincipal.add(panelJugador);
		panelJugador.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblPuntaje = new JLabel("Puntaje: ");
		lblPuntaje.setHorizontalAlignment(SwingConstants.LEFT);
		lblPuntaje.setForeground(Color.WHITE);
		lblPuntaje.setFont(new Font("Tahoma", Font.BOLD, 17));
		panelJugador.add(lblPuntaje);
		
		Panel panelPuntajeJugador = new Panel();
		panelPuntajeJugador.setBackground(new Color(255, 255, 255));
		panelJugador.add(panelPuntajeJugador);
		
		JLabel lblNewLabel_1 = new JLabel("Puntaje Jugador");
		panelPuntajeJugador.add(lblNewLabel_1);
		lblNewLabel_1.setEnabled(false);
		
		JLabel lblJugador = new JLabel("Jugador: ");
		lblJugador.setVerticalAlignment(SwingConstants.TOP);
		lblJugador.setHorizontalAlignment(SwingConstants.LEFT);
		lblJugador.setForeground(Color.WHITE);
		lblJugador.setFont(new Font("Tahoma", Font.BOLD, 18));
		panelJugador.add(lblJugador);
		
		Panel panelPuntajeJugador_1 = new Panel();
		panelPuntajeJugador_1.setBackground(Color.WHITE);
		panelJugador.add(panelPuntajeJugador_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombre Jugador");
		lblNewLabel_1_1.setEnabled(false);
		panelPuntajeJugador_1.add(lblNewLabel_1_1);
		
		JPanel panelOpcionesJuego = new JPanel();
		panelOpcionesJuego.setBackground(new Color(32, 178, 170));
		panelOpcionesJuego.setBounds(0, 0, 634, 33);
		panelPrincipal.add(panelOpcionesJuego);
		panelOpcionesJuego.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblTamanio = new JLabel("Tama\u00F1o:");
		lblTamanio.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblTamanio.setHorizontalAlignment(SwingConstants.LEFT);
		lblTamanio.setForeground(new Color(255, 255, 255));
		panelOpcionesJuego.add(lblTamanio);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"5", "10", "15"}));
		panelOpcionesJuego.add(comboBox);
		
		
		JLabel lblDificultad = new JLabel("Dificultad: ");
		lblDificultad.setForeground(new Color(255, 255, 255));
		panelOpcionesJuego.add(lblDificultad);
		lblDificultad.setHorizontalAlignment(SwingConstants.LEFT);
		lblDificultad.setVerticalAlignment(SwingConstants.TOP);
		lblDificultad.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JRadioButton rdbtnDifBaja = new JRadioButton("Baja");
		rdbtnDifBaja.setSelected(true);
		buttonDificultadGroup.add(rdbtnDifBaja);
		rdbtnDifBaja.setBackground(new Color(102, 205, 170));
		panelOpcionesJuego.add(rdbtnDifBaja);
		
		JRadioButton rdbtnDifMedia = new JRadioButton("Media");
		buttonDificultadGroup.add(rdbtnDifMedia);
		rdbtnDifMedia.setBackground(new Color(102, 205, 170));
		panelOpcionesJuego.add(rdbtnDifMedia);
		
		JRadioButton rdbtnDifAlta = new JRadioButton("Alta");
		buttonDificultadGroup.add(rdbtnDifAlta);
		rdbtnDifAlta.setBackground(new Color(102, 205, 170));
		panelOpcionesJuego.add(rdbtnDifAlta);
		
		// Initialize board size CHATGPT
        //boardSize = 5;
        
        
        
        setVisible(true);
        
        
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(32, 178, 170));
		panelMenu.setBounds(500, 33, 134, 500);
		panelPrincipal.add(panelMenu);
		panelMenu.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNuevoJuego = new JButton("<html><center>Nuevo<html>");
		buttonMenuGroup.add(btnNuevoJuego);
		btnNuevoJuego.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNuevoJuego.setForeground(new Color(102, 205, 170));
		btnNuevoJuego.setBackground(new Color(255, 255, 255));
		panelMenu.add(btnNuevoJuego);
		
		JButton btnReiniciar = new JButton("<html><center>Reiniciar<html>");
		buttonMenuGroup.add(btnReiniciar);
		btnReiniciar.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnReiniciar.setForeground(new Color(102, 205, 170));
		btnReiniciar.setBackground(new Color(255, 255, 255));
		panelMenu.add(btnReiniciar);
		
		JButton btnTop = new JButton("<html><center>Top 10<html>");
		buttonMenuGroup.add(btnTop);
		btnTop.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnTop.setForeground(new Color(102, 205, 170));
		btnTop.setBackground(new Color(255, 255, 255));
		panelMenu.add(btnTop);
		
		JButton btnCambiarNombre = new JButton("<html><center>Cambiar Nombre<html>");
		buttonMenuGroup.add(btnCambiarNombre);
		btnCambiarNombre.setVerticalAlignment(SwingConstants.TOP);
		btnCambiarNombre.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnCambiarNombre.setForeground(new Color(102, 205, 170));
		btnCambiarNombre.setBackground(new Color(255, 255, 255));
		panelMenu.add(btnCambiarNombre);
		
		
		
	}
	/*
	
	  // Tama�o de la ventana
	  private final int windowSize = 800;

	  // Tama�o de la imagen
	  private final int imageSize = 100;

	  // N�mero de filas y columnas
	  private final int rows = windowSize / imageSize;
	  private final int cols = windowSize / imageSize;

	  // Matriz para almacenar las im�genes
	  private BufferedImage[][] images = new BufferedImage[rows][cols];

	  // Imagen sim�trica
	  private BufferedImage symmetricalImage = new BufferedImage(windowSize, windowSize, BufferedImage.TYPE_INT_ARGB);

	  public 0() {
	    // Obtiene el contexto gr�fico de la imagen sim�trica
	    Graphics2D g2d = symmetricalImage.createGraphics();

	    // Dibuja la matriz sim�trica
	    for (int row = 0; row < rows; row++) {
	      for (int col = 0; col < cols; col++) {
	        // Calcula la posici�n de la imagen
	        int x = col * imageSize;
	        int y = row * imageSize;

	        // Crea una nueva imagen con el tama�o actual
	        BufferedImage image = new BufferedImage(imageSize, imageSize, BufferedImage.TYPE_INT_ARGB);

	        // Dibuja algo en la imagen (por ejemplo, un rect�ngulo relleno de color)
	        Graphics2D g2dImage = image.createGraphics();
	        g2dImage.setColor(Color.RED);
	        g2dImage.fillRect(0, 0, imageSize, imageSize);
	        g2dImage.dispose();

	        // Guarda la imagen en la matriz
	        images[row][col] = image;

	        // Copia la imagen en la posici�n actual
	        g2d.drawImage(image, x, y, null);
	      }
	    }

	    // Agrega un MouseListener al panel
	    addMouseListener(new MouseAdapter() {
	      public void mouseClicked(MouseEvent e) {
	        // Obtiene la posici�n del clic del mouse
	        int mouseX = e.getX();
	        int mouseY = e.getY();

	        // Calcula la fila y la columna en la que se hizo clic
	        int row = mouseY / imageSize;
	        int col = mouseX / imageSize;

	        // Obtiene la imagen que se encuentra en la fila y la columna
	        BufferedImage clickedImage = images[row][col];

	        // Realiza alguna acci�n con la imagen (por ejemplo, cambia su color)
	        Graphics2D g2dImage = clickedImage.createGraphics();
	        g2dImage.setColor(Color.BLUE);
	        g2dImage.fillRect(0, 0, imageSize, imageSize);
	        g2dImage.dispose();

	        // Redibuja la matriz sim�trica en el lienzo
	        repaint();
	      }
	    });
	  }

	  public void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    // Dibuja la matriz sim�trica en el lienzo
	    g.drawImage(symmetricalImage, 0, 0, null);
	  }

	  public Dimension getPreferredSize() {
	    return new Dimension(windowSize, windowSize);
	  }	
	*/
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventanajuego frame = new ventanajuego();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	
	public static void main(String[] args) {
		
					ventanajuego frame = new ventanajuego();
					frame.setVisible(true);
				
	}
}
