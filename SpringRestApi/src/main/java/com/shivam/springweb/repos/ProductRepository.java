package com.shivam.springweb.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.springweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
