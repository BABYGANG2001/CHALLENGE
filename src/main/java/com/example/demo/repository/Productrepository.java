package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface Productrepository extends JpaRepository<Product, Long> {

    // 1. Find all products by their exact category (e.g., "Electronics")
    List<Product> findByCategory(String category);

    // 2. Find all products with a price less than a given maxPrice
    List<Product> findByPriceLessThan(double maxPrice);

    // 3. Find all products by name, ignoring case sensitivity (e.g., "laptop" matches "Laptop")
    List<Product> findByNameIgnoreCase(String name);
}
