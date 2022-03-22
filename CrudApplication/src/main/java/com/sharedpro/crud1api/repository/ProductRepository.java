package com.sharedpro.crud1api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sharedpro.crud1api.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
