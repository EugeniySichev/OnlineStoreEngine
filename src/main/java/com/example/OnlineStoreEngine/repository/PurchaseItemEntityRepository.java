package com.example.OnlineStoreEngine.repository;


import com.example.OnlineStoreEngine.entity.PurchaseItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseItemEntityRepository extends JpaRepository<PurchaseItemEntity, Integer> {
}