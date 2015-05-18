package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.CardLayout;

public class VistaApp extends JFrame {

	private JPanel contenedorVentanas;
	private JMenuBar menuBar;
	private JPanel vistaPrincipal;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public VistaApp() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 440);
		
		creacionMenu();
		
		
		
		
		
		
		/* Generamos el contenedor de ventanas*/
		
		contenedorVentanas = new JPanel();
		contenedorVentanas.setBorder(new EmptyBorder(5, 5, 5, 5));
		contenedorVentanas.setLayout(new CardLayout());
		
		
		
		
		
		
		/* Le aplicamos al Jframe el JPanel generado */
		setContentPane(contenedorVentanas);
		
		
	}
	
	
	public JPanel getContenedor() {
		return this.contenedorVentanas;
	}
	
	
	
	
	
	
	/**
	 * Generamos un menú con una barra de menúJMenuBar,
	 *  sobre ella tres JMenu y en el primer JMenu un JMenuItem
	 */

	private void creacionMenu() {
		
		menuBar = new JMenuBar();
		
		this.setJMenuBar(menuBar);
		
		JMenu menuPrincipal = new JMenu("Principal");
		menuBar.add(menuPrincipal);
		
		JMenuItem itemPrincipal = new JMenuItem("Principal");
		menuPrincipal.add(itemPrincipal);
		
		JMenu menuJuegos = new JMenu("Juegos");
		menuBar.add(menuJuegos);
		
		JMenu menuPerfil = new JMenu("Perfil");
		menuBar.add(menuPerfil);
	}

}
