CREATE SCHEMA dlk_operacional_productos
    AUTHORIZATION postgres;

COMMENT ON SCHEMA dlk_operacional_productos
    IS 'Esquema para la prueba piloto de DisPharma';


CREATE TABLE dlk_operacional_productos.opr_cat_productos
(
    md_uuid character varying(300) NOT NULL,
    md_fch date,
    id_producto bigint NOT NULL,
    cod_producto character varying(300) NOT NULL,
    nombre_producto character varying(300),
    tipo_producto_origen character varying(300),
    tipo_producto_clase character varying(300),
    des_producto character varying(300),
    fch_alta_producto timestamp without time zone,
    fch_baja_producto timestamp without time zone,
    PRIMARY KEY (id_producto)
);

ALTER TABLE IF EXISTS dlk_operacional_productos.opr_cat_productos
    OWNER to postgres;

COMMENT ON TABLE dlk_operacional_productos.opr_cat_productos
    IS 'Tabla que almacena los datos de los productos ';
    
    CREATE SEQUENCE IF NOT EXISTS "dlk_operacional_productos"."seq_dlk_operacional_productos_idProducto"
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1
    OWNED BY "opr_cat_productos".id_Producto;

ALTER SEQUENCE "dlk_operacional_productos"."dlk_operacional_productos"."seq_dlk_operacional_productos_idProducto"
    OWNER TO postgres;
    