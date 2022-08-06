package com.gabriel.br.apitraining.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.br.apitraining.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
