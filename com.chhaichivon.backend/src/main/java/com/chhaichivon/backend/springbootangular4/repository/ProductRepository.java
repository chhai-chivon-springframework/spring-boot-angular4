package com.chhaichivon.backend.springbootangular4.repository;

import com.chhaichivon.backend.springbootangular4.models.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 9/1/2017
 * TIME   : 2:23 PM
 */
@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product,Long>{
}
