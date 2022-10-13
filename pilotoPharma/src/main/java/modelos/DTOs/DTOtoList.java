package modelos.DTOs;
import java.util.*;
import java.sql.*;

/*
 * DTOtoList --> Clase que nos permitirá mostrar los resultados de las busquedas de forma mas sencilla utilizando una lista para mostrar los datos 
 * obtenidos de la tabla opr_cat_productos
 */

public class DTOtoList {
	
//	Creamos el metodo generaLista que recibe un ResultSet y devuelve una lista del tipo productoDTO
	public static ArrayList<ProductoDTO> generarListaProductos(ResultSet rs) {

		System.out.println("[INFO] -- Entrando en modelos.DTOs.DTOtoList");
		ArrayList<ProductoDTO> resultToList = new ArrayList<ProductoDTO>();

//		Creamos objetos del tipo productoDTO con los resultados obtenidos y los añadimos a la lista
		try {
			while (rs.next()) {
				resultToList.add(new ProductoDTO(rs.getString("md_uuid"), rs.getDate("md_fch"), rs.getInt("id_producto"), rs.getString("cod_producto"), rs.getString("nombre_producto"), rs.getString("tipo_producto_origen"), rs.getString("tipo_producto_clase") ,rs.getString("des_producto"), rs.getDate("fch_alta_producto"), rs.getDate("fch_baja_producto")));
			}

		} catch (Exception e) {
			System.out.println("[ERROR] -- modelos.DTOtoList.generarListaProductos -- " +  e.toString());
		}
		
		System.out.println("[INFO] -- Saliendo de modelos.DTOs.DTOtoList");
		return resultToList;

	}
	

}
