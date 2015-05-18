package main;

import java.awt.EventQueue;

import controlador.UsuarioController;
import vistas.VistaApp;

public class GameDB {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					/*Generamos la vista y el primer controlador al que llamaremos*/
					VistaApp frame = new VistaApp(); 
					frame.setVisible(true);
					
					UsuarioController controladorUser = new UsuarioController(frame);
					controladorUser.getVistaPrincipal();
					
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
