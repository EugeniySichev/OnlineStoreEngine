package com.example.OnlineStoreEngine.repository;


import com.example.OnlineStoreEngine.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer> {
}
