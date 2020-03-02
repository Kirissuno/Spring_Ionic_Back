package com.jacaranda.brenes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacaranda.brenes.model.Carrito;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Integer> {

}
