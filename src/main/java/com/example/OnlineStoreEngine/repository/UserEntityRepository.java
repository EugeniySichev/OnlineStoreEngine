package com.example.OnlineStoreEngine.repository;

import com.example.OnlineStoreEngine.entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {
}
