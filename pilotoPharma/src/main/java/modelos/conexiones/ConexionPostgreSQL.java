package modelos.conexiones;

import java.sql.*;

/*
 * ConexionPostgreSQL --> Clase que nos genera un objeto de tipo conexión para conectarnos a la base de datos PostgreSQL
 */

public class ConexionPostgreSQL {
	
	public static Connection generarConexion(String user, String passw, String host, String db, int port) {
//		Creamos la conexion como null e inicializamos la string de conexion
		Connection conn = null;
		String connString = "jdbc:postgresql://" + host + ":" + port + "/" + db;
		
		try {			
//			Generamos el Class.forName
			System.out.println("[INFO]  -- modelos.conexiones.ConexionPostgreSQL.generarConexion -- Generando conexion ");
			try {
				Class.forName("org.postgresql.Driver");
			} catch (Exception e) {
				System.out.println("[ERROR] -- modelos.conexiones.ConexionPostgreSQL.generarConexion " + e.toString());
			}
//			Creamos la conexion pasandole nuestra string de conexión
			System.out.println("[INFO] Generando conexión a PostgreSQL");
			conn = DriverManager.getConnection(connString, user, passw);
			boolean esValida = conn.isValid(50000);
			if(!esValida) {
				System.out.println("[ERROR] -- modelos.conexiones.ConexionPostgreSQL.generarConexion -- La conexion no es valida, cerrando");
				conn.close();
				return conn;
			}
			System.out.println("[INFO] -- modelos.conexiones.ConexionPostgreSQL.generarConexion -- Conexion creada correctamente, saliendo de generarConexion \n");						
			
		} catch (Exception e) {
			System.out.println("[ERROR] -- modelos.generarConexion] " + e.toString());
		}		
		
		return conn;
	}
	
}
