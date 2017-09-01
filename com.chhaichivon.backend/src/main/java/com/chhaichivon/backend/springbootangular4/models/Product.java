package com.chhaichivon.backend.springbootangular4.models;

import com.chhaichivon.backend.springbootangular4.utils.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * AUTHOR : CHHAI CHIVON
 * EMAIL  : chhaichivon1995@gmail.com
 * DATE   : 9/1/2017
 * TIME   : 2:23 PM
 */
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_product")
public class Product extends BaseEntity {
    private String productName;
    private String price;
    private String imageUrl;
    private String description;
}