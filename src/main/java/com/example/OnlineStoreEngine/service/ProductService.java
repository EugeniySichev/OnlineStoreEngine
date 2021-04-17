package com.example.OnlineStoreEngine.service;



import com.example.OnlineStoreEngine.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    List<ProductEntity> findAll();

    ProductEntity findById(Integer id);
}