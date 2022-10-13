package modelos.consultas;

import java.sql.*;

/*
 * ConsultasInsert --> Clase con la que realizaremos las consultas de tipo insert
 */

public class ConsultasInsert {

	public static void insertProducto(Connection conn) {

		try {
			// Realizamos el insert
			Statement st = conn.createStatement();
			String sql = "Insert into \"pruebasConexion\".\"alumnos\" VALUES (adf131029022fch12345, \'Curdate()\',DEFAULT, 'hig_p_gelf_f', 'Gel de aceite de fresa, Farlane', 'Propio', 'Higiene', 'Gel de aceite de fresa producido por marca propia Farlane', );";
			st.executeUpdate(sql);
			// Cerramos la conexión
			conn.close();

		} catch (Exception e) {
			System.out.println("[ERROR] -- modelos.consultas.ConsultasInsert.insertProducto -- " + e.toString());
		}

	}

}
