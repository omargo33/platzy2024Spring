package com.platzi.market.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa la tabla de categorias en la base de datos
 * que tiene la este sql: SELECT id, nombre, apellidos, celular, direccion, correo_electronico FROM public.clientes;
 * 
 * cuyo indice es id.
 */

@Entity
@Table(name = "clientes")
@Getter
@Setter
public class Cliente {
    
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "celular")
    private Long celular;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;
}
