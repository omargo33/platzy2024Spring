package com.platzi.market.persistence.crud;

import java.util.Optional;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.platzi.market.persistence.entity.Compra;

public interface CompraCrudRepository extends CrudRepository<Compra, Integer>{

    Optional<List<Compra>> findByIdCliente(String idCliente);
}
