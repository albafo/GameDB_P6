package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Usuario {
	
	/* Atributos del modelo como en la base de datos */
	
	private int id;
	private String usuario;
	private String nombre;
	
	
	/* Getters y Setters de los atributos de la clase */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	/* Método que nos devuelve todos los usuarios del sistema */
	
	public static ArrayList<Usuario> getAll() {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>(); //Inicializamos variable de retorno
		
		MySql mysql = MySql.getInstance(); //Obtenemos instancia de nuestro conector MySql
		
		ResultSet resultadosBD = mysql.query("SELECT * FROM usuarios");
		
		
		/* Recorremos los resultados de nuestra consulta y vamos generando objetos Usuario*/
		try {
			while(resultadosBD.next()) {
				
				Usuario usuario = new Usuario();
				
				//Seteamos el objeto con los resultados de la consulta
				usuario.setId(resultadosBD.getInt("id"));
				usuario.setNombre(resultadosBD.getString("nombre"));
				usuario.setUsuario(resultadosBD.getString("usuario"));
				
				//Metemos el usuario dentro del array de retorno
				usuarios.add(usuario);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Retornamos el arraylist
		return usuarios;
	}
	
	//Para mostrar los nombres en el combobox
	public String toString() {
		
		return this.getNombre();
	}
	
}
