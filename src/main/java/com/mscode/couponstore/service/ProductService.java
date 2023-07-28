package com.mscode.couponstore.service;

import com.mscode.couponstore.model.Product;
import com.mscode.couponstore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }
    public Optional<Product> getProductbyId(long id){
        return productRepository.findById(id);
    }
    public  void addProducts(Product product){
        productRepository.save(product);
    }

    public  void removeProductById(long id){
        productRepository.deleteById(id);
    }
    public List<Product> getAllProductsByCategory(int id){
        return productRepository.findAllByCat_Id( id);
    }


}
