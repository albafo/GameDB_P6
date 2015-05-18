package controlador;


import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.JPanel;

import modelo.Usuario;
import vistas.VistaApp;
import vistas.VistaPrincipal;



public class UsuarioController {

	private JPanel vistaP;
	private JPanel contenedor;
	
	
	public UsuarioController(VistaApp frame) {
		
		this.contenedor = frame.getContenedor(); //Seteamos el contendor de ventanas
		
		this.vistaP = new VistaPrincipal(this); //Generamos una nueva VistaPrincipal
		
		this.contenedor.add(this.vistaP, "VistaP");
		
		CardLayout cardLayout = (CardLayout) (this.contenedor.getLayout());
		

		
	}
	
	
	/*
	 * Método que nos mostrará la vista Principal
	 */
	public void getVistaPrincipal() {
		
		CardLayout cardLayout = (CardLayout) (this.contenedor.getLayout());
		cardLayout.show(this.vistaP, "VistaP");


	}
	
	public ArrayList<Usuario> getAllUsers() {
		
		return Usuario.getAll();
	}
	

}
