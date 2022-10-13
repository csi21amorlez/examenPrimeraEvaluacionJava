package modelos.DTOs;

import java.sql.Date;

/*
 * ProductoDTO --> DTO para la tabla opr_cat_productos de la base de datos
 */

public class ProductoDTO {
	
//	Atributos
	private String md_uuid;	
	private Date md_fch;
	private int id_producto;
	private String cod_producto;
	private String nombre_producto;
	private String tipo_producto_origen;
	private String tipo_producto_clase;
	private String des_producto;
	private Date fch_alta_producto;
	private Date fch_baja_producto;

//	Constructor
	public ProductoDTO(String md_uuid, Date md_fch, int id_producto, String cod_producto, String nombre_producto,
			String tipo_producto_origen, String tipo_producto_clase, String des_producto, Date fch_alta_producto,
			Date fch_baja_producto) {
		super();
		this.md_uuid = md_uuid;
		this.md_fch = md_fch;
		this.id_producto = id_producto;
		this.cod_producto = cod_producto;
		this.nombre_producto = nombre_producto;
		this.tipo_producto_origen = tipo_producto_origen;
		this.tipo_producto_clase = tipo_producto_clase;
		this.des_producto = des_producto;
		this.fch_alta_producto = fch_alta_producto;
		this.fch_baja_producto = fch_baja_producto;
	}
//	Getters 
	public String getMd_uuid() {
		return md_uuid;
	}
	public Date getMd_fch() {
		return md_fch;
	}
	public int getId_producto() {
		return id_producto;
	}
	public String getCod_producto() {
		return cod_producto;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public String getTipo_producto_origen() {
		return tipo_producto_origen;
	}
	public String getTipo_producto_clase() {
		return tipo_producto_clase;
	}
	public String getDes_producto() {
		return des_producto;
	}
	public Date getFch_alta_producto() {
		return fch_alta_producto;
	}
	public Date getFch_baja_producto() {
		return fch_baja_producto;
	}
	
//	Metodo toString
	@Override
	public String toString() {
		return "Producto [md_uuid=" + md_uuid + ", md_fch=" + md_fch + ", id_producto=" + id_producto
				+ ", cod_producto=" + cod_producto + ", nombre_producto=" + nombre_producto + ", tipo_producto_origen="
				+ tipo_producto_origen + ", tipo_producto_clase=" + tipo_producto_clase + ", des_producto="
				+ des_producto + ", fch_alta_producto=" + fch_alta_producto + ", fch_baja_producto=" + fch_baja_producto
				+ "]";
	}
	
	
	
	
}
