package com.example.demoproject.service;

import com.example.demoproject.entity.Product;
import com.example.demoproject.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAllProducts(String title) {
        if (title != null) {
            return productRepository.findByTitle(title);
        }
        return productRepository.findAll();
    }

    public Product findByIdProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public void saveProduct(Product product) {
        log.info("Saving new product: {}", product);
        productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        log.info("Delete product with id: {}", id);
        productRepository.deleteById(id);
    }
}