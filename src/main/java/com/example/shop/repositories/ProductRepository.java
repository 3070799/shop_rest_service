package com.example.shop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.shop.entityes.Product;

public interface ProductRepository extends CrudRepository<Product,Long> {

}
