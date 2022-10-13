package modelos.consultas;

import java.sql.*;

/*
 * ConsultasSelect --> Clase con la que realizaremos las consultas de tipo Select a la base de datos
 */

public class ConsultasSelect {

//	Consulta que nos devuelve todos los datos de la tabla 
	public static ResultSet selectAll(Connection conn) {

		ResultSet rs = null;
		Statement st = null;

		try {
//			Incializamos el statement
			st = conn.createStatement();
		} catch (SQLException e) {
			System.out.println("[ERROR] -- modelos.consultas.selectall --" + e.toString());
		}
// Declaramos la consulta sql
		String consulta = "SELECT * FROM \"\".\"alumnos\"";

		try {
			rs = st.executeQuery(consulta);
//			Cerramos la conexión
			conn.close();

		} catch (Exception e) {
			System.out.println("[INFO] -- modelos.consultas.selectAll -- " + e.toString());
		}
		
		return rs;
	}

}
