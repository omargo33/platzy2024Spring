package com.platzi.market.persistence.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa la tabla de compras_productos en la base de datos
 * que tiene la este sql: SELECT id_compra, id_producto, cantidad, total, estado
 * FROM public.compras_productos;;
 * 
 * cuyo indice es id_compra y id_producto.
 */

@Entity
@Table(name = "compras_productos")
@Getter
@Setter
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPk id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @MapsId("idCompra")
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

}
