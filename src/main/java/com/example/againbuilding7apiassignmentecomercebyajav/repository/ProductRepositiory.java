package com.example.againbuilding7apiassignmentecomercebyajav.repository;

import com.example.againbuilding7apiassignmentecomercebyajav.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import  java.util.*;

@Repository
public interface ProductRepositiory extends CrudRepository<Product,Long> {
    Product findByTitleEquals(String title);
    Product findProductByTitleEqualsAndPrice_Price(String title, Double price);
    List<Product>findProductByPrice_Currency(String currency);



}
