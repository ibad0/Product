package com.product.service;

import com.product.model.Product;

import java.util.List;
import java.util.Optional;


public interface ProductService {


    //add product to db
     Product addProduct(Product product);

     //update product
    Product updateProduct(Product product);

    //delete Product

    Object deleteProduct(Long id);

    //get all products
    List<Product> getAllProducts();

    //get a product
    Optional<Product> getProduct(Long id);


}
