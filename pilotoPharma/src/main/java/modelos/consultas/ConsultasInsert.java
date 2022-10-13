package modelos.consultas;

import java.sql.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

/*
 * ConsultasInsert --> Clase con la que realizaremos las consultas de tipo insert
 */

public class ConsultasInsert {

	public static void insertProducto(Connection conn) {

		System.out.println("[INFO] -- Entrando en modelos.consultas.ConsultasInsert.insertProducto");
		try {
			// Realizamos el insert
			Statement st = conn.createStatement();

			
			String sql = "Insert into \"dlk_operacional_productos\".\"opr_cat_productos\" VALUES ('adf131029022fch12345', "+ null  +", DEFAULT, 'hig_p_gelf_f', 'Gel de aceite de fresa, Farlane', 'Propio', 'Higiene', 'Gel de aceite de fresa producido por marca propia Farlane', " + null + ", " + null +");";
			st.executeUpdate(sql);
			// Cerramos la conexión			

		} catch (Exception e) {
			System.out.println("[ERROR] -- modelos.consultas.ConsultasInsert.insertProducto -- " + e.toString());
		}
		System.out.println("[INFO] -- Saliendo de modelos.consultas.ConsultasInsert.insertProducto");

	}

}
