package com.app.ecommerce.controller;

import com.app.ecommerce.dao.ProductRepository;
import com.app.ecommerce.entity.Product;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    private ProductRepository repo;

    public HomeController(ProductRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public ResponseEntity<?> redirectToProducts() {
        HttpHeaders headers = new HttpHeaders();
        List<Product> resp = repo.findAll();
        headers.add("Location", "/api/products"); // Set the redirect URL
        return new ResponseEntity<>(resp, headers, HttpStatus.FOUND); // 302 Found status
    }
}
