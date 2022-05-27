package com.example.demo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductListRepository extends JpaRepository<Product, Long> {
    List<Product> findById(int id);

    List<Product> findByName(String name);
}
