package com.example.OnlineStoreEngine.repository;

import com.example.OnlineStoreEngine.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductEntityRepository extends JpaRepository<OrderEntity, Integer> {

}
