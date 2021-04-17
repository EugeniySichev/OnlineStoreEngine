package com.example.OnlineStoreEngine.service;

import com.example.OnlineStoreEngine.entity.UserEntity;

public interface UserService {

    UserEntity findOrCreateUser(String name, String surname,
                                String phone, String email,
                                String address);
}