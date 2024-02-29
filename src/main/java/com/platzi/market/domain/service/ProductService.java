package com.platzi.market.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platzi.market.domain.Product;
import com.platzi.market.domain.repository.ProductRepository;

@Service
@Transactional
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Optional<Product> getProduct(int productId){
        return productRepository.getProduct(productId);
    }

    public Product save(Product product){
        return productRepository.save(product);
    }

    public boolean delete(int productId){        
        productRepository.getProduct(productId).map( 
            product -> {
                productRepository.delete(productId);
                return true;
            }
        );
        
        return false;
    }

    public Optional<List<Product>> getByCategory(int cateboryId){
        return productRepository.getByCategory(cateboryId);        
    }

    public Optional<List<Product>> getScarseProducts(int quantity){
        return productRepository.getScarseProducts(quantity);
    }
}
