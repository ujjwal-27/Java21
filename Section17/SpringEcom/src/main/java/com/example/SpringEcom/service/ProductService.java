package com.example.SpringEcom.service;

import com.example.SpringEcom.Repository.ProductRepository;
import com.example.SpringEcom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    /**
     * The 'findById' methods returns Optional type, which handles null value.
     * If the product of respective ID is present, it returns the detail if product. Else, it returns null.
     * @param id [Integer] Product ID.
     * @return Product detail or null.
     */
    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }
}
