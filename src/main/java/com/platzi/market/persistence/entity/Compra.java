package com.platzi.market.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa la tabla de productos en la base de datos
 * que tiene la este sql: SELECT id_compra, id_cliente, fecha, medio_pago,
 * comentario, estado FROM public.compras;
 * 
 * cuyo indice es id_compra.
 */

@Entity
@Table(name = "compras")
@Getter
@Setter
public class Compra {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id_compra")
        private Integer idCompra;

        @Column(name = "id_cliente")
        private String idCliente;

        @Column(name = "fecha")
        private LocalDateTime fecha;

        @Column(name = "medio_pago")
        private String medioPago;

        @Column(name = "comentario")
        private String comentario;

        @Column(name = "estado")
        private String estado;

        @ManyToOne
        @JoinColumn(name = "id_cliente", insertable = false, updatable = false)
        private Cliente cliente;

        @OneToMany(mappedBy = "compra", cascade = { CascadeType.ALL })
        private List<CompraProducto> productos;

}
