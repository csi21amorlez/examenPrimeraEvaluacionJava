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

		ArrayList<ProductoDTO> resultToList = new ArrayList<ProductoDTO>();

//		Creamos objetos del tipo productoDTO con los resultados obtenidos y los añadimos a la lista
		try {
			while (rs.next()) {
				resultToList.add(new ProductoDTO(rs.getString(0), rs.getDate(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(7), rs.getString(8), rs.getDate(9), rs.getDate(10)));
			}

		} catch (Exception e) {
			System.out.println("[ERROR] -- modelos.DTOtoList.generarListaProductos -- " +  e.toString());
		}

		return resultToList;

	}
	

}
