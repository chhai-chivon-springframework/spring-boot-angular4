package com.chhaichivon.backend.springbootangular4.services;

import com.chhaichivon.backend.springbootangular4.models.Product;
import com.chhaichivon.backend.springbootangular4.repository.ProductRepository;
import com.chhaichivon.backend.springbootangular4.utils.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 9/1/2017
 * TIME   : 2:27 PM
 */
@Service
public class ProductService implements BaseService<Product> {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findById(long id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product save(Product entity) {
        return productRepository.save(entity);
    }

    @Override
    public void update(Product entity) {
        productRepository.save(entity);
    }

    @Override
    public void delete(Product entity) {
        productRepository.delete(entity);
    }
}
