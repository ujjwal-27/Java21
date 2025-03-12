package com.example.SpringEcom.controller;

import com.example.SpringEcom.model.Product;
import com.example.SpringEcom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins = "http://localhost:5173/")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("products")
    public ResponseEntity<List<Product>> getProducts() {
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    /**
     * This method uses ResponseEntity class to integrate response status.
     * Since the 'getProductById' method from productService returns Optional type, Optional<Product> is defined in angular bracket of ResponseEntity in method's return type.
     * @param id [Integer] Product ID.
     * @return If product detail is present, it returns product detail with response 200. Else, it just returns response 404.
     */
    @GetMapping("product/{id}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable("id") int id) {
        Optional<Product> product = productService.getProductById(id);

        // Handling null value
        if (product.isPresent()) {
            return new ResponseEntity<>(product, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     *
     * @param product Product details except image data.
     * @param image Here, in 'RequestPart' annotation, the 'imageFile' is key mentioned in JSON data, sent from the client. Instead, we can simply mention '@RequestPart MultipartFile imageFile'. Matching the variable name with the key will also work.
     * @return Saved product detail or error message.
     */
    @PostMapping("product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart("imageFile") MultipartFile image) {
        try {
            Product savedProduct = productService.addProduct(product, image);

            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);

        } catch (IOException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
