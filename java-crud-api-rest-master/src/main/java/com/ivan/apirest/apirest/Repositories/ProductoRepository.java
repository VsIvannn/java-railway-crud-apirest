package com.ivan.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivan.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
