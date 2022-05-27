package com.example.demo;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ProductServiceController {

    @Autowired
    ProductListRepository productListRepository;

    @RequestMapping("/productsxxx")
    public ResponseEntity<List<Product>> getAllProducts(@RequestParam(required = false) String name) {

        List<Product> Products = new ArrayList<Product>();
        if (name == null)
            productListRepository.findAll().forEach(Products::add);
        else
            productListRepository.findByName(name).forEach(Products::add);
        if (Products.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(Products, HttpStatus.OK);
    }
}

