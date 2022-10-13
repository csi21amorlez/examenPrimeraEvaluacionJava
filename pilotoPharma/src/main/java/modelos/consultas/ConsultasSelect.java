package modelos.consultas;

import java.sql.*;

/*
 * ConsultasSelect --> Clase con la que realizaremos las consultas de tipo Select a la base de datos
 */

public class ConsultasSelect {

//	Consulta que nos devuelve todos los datos de la tabla 
	public static ResultSet selectAll(Connection conn) {
		// Declaramos la consulta sql
		System.out.println("[INFO] Entrando en modelos.consultas.selectAll");
		String sql = "SELECT * FROM \"dlk_operacional_productos\".\"opr_cat_productos\"";
		try {
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[INFO] -- modelos.consultas.selectAll -- " + e.toString());
		}	
	System.out.println("[INFO] -- Saliendo de modelos.consultas.selectAll");
		
		return null;
	}

}
