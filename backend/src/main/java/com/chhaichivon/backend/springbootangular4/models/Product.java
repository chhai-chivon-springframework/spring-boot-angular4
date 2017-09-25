package com.chhaichivon.backend.springbootangular4.models;

import com.chhaichivon.backend.springbootangular4.utils.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
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
    @Column
    private String productName;

    @Column
    private String price;

    @Column
    private String imageUrl;

    @Column
    private String description;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}