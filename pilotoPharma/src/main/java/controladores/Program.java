package controladores;

import modelos.*;
import modelos.DTOs.ProductoDTO;
import modelos.conexiones.ConexionPostgreSQL;

import java.sql.*;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class Program {

	public static void main(String[] args) {

//		Creamos la conexion con la base de datos
		Connection conn = ConexionPostgreSQL.generarConexion(Util.getUser(), Util.getPassw(), Util.getHost(),
				Util.getDb(), Util.getPort());

//		Lllamamos al metodo insertProducto para insertar un producto de ejemplo
		modelos.consultas.ConsultasInsert.insertProducto(conn);

//		Realizamos el select a la base de datos		
		ResultSet rs = modelos.consultas.ConsultasSelect.selectAll(conn);
		ArrayList<ProductoDTO> listProductos = modelos.DTOs.DTOtoList.generarListaProductos(rs);
		
//		Leemos los resultados de la consulta
		for(ProductoDTO product : listProductos)
			System.out.println(product.toString());
		try {
			System.out.println("[INFO] -- controladores.Program.main-- Cerrando conexion");
		} catch (Exception e) {
			System.out.println("[ERROR] -- controladores.Program.main -- " + e.toString());
		}
	}

}
