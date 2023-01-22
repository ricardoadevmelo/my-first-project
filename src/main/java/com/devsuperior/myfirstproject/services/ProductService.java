package com.devsuperior.myfirstproject.services;

import com.devsuperior.myfirstproject.entities.Product;
import com.devsuperior.myfirstproject.repositories.ProductRepository;
import com.devsuperior.myfirstproject.services.servicesExceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Product findById(Long id){
        return productRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Id not found " + id));
    }
}
