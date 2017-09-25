package com.chhaichivon.backend.springbootangular4.utils;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 9/1/2017
 * TIME   : 2:27 PM
 */
public interface BaseService<T> extends Serializable {
     Page<T> findAll(Pageable pageable);
     T findById(long id);
     T save(T entity);
     void update(T entity);
     void delete(T entity);
}
