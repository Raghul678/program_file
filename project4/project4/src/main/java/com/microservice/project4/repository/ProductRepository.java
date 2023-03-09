package com.microservice.project4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.project4.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
