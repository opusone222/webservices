package com.sidgs.dao;

import com.sidgs.model.Products;

import java.util.List;

/**
 * Created by Vytlasai on 2/20/2017.
 */
public interface ProductsDao {

    void add(Products product);
    List<Products> getProducts() ;
    Products getProduct(int product_id);
    void remove(int product_id);
}
