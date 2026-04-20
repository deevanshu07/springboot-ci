package com.example.cicdpipeline.controller;

import com.example.cicdpipeline.SpringbootCiApplication;
import com.example.cicdpipeline.entity.Product;
import com.example.cicdpipeline.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
    public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product create(@RequestBody Product p) {
        return service.save(p);
    }

    @GetMapping
    public List<Product> getAll() {
        return service.getAll();
    }
}