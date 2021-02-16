package com.psouza.springwebdemo.repositories;

import com.psouza.springwebdemo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
