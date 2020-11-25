package Exception;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * En esta clase conectamos la BD a la aplicación y vemos que la conexion sea correcta.
 */
public class BBdd {
	
	public static final String CONTROLADOR = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/proyecto_mecanica";
	public static final String USUARIO = "root";
	public static final String CLAVE = "123456";
	
	public static Connection conectar() {
		Connection conexion = null;
		
		try {
			Class.forName(CONTROLADOR);
			conexion = DriverManager.getConnection(URL,USUARIO,CLAVE);
			System.out.println("Conexión OK");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el controlador");
			e.printStackTrace();
			
		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		
		return conexion;
	}
	
	public static void main(String[] args) {
		
		
	}

	

}
