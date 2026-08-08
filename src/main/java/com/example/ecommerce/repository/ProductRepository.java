package com.example.ecommerce.repository;

import com.example.ecommerce.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Finds rows where product_title contains search_text (case-insensitive)
    List<Product> findByTitleContainingIgnoreCase(String searchText);
}
