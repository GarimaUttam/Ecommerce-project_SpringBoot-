package com.garima.ecom_project.controller;

import com.garima.ecom_project.model.Product;
import com.garima.ecom_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;


    @RequestMapping("/")
    public String greet(){
        return "garimauttam@google.com";

    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();

    }
}
