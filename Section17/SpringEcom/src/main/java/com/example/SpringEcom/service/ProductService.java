package com.example.SpringEcom.service;

import com.example.SpringEcom.Repository.ProductRepository;
import com.example.SpringEcom.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
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

    /**
     *
     * @param product Product detail
     * @param image Image detail
     * @return Saved product detail
     * @throws IOException The exception from this method is handled in controller.
     */
    public Product saveProduct(Product product, MultipartFile image) throws IOException {
        product.setImageName(image.getOriginalFilename());
        product.setImageType(image.getContentType());
        product.setImageData(image.getBytes());

        return productRepository.save(product);
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    public List<Product> searchProduct(String keyword) {
        return productRepository.searchProduct(keyword);
    }
}
