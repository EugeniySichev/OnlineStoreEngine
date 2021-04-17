package com.example.OnlineStoreEngine.service;

import com.example.OnlineStoreEngine.entity.UserEntity;
import com.example.OnlineStoreEngine.repository.UserEntityRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.OnlineStoreEngine.entity.UserRole.CUSTOMER;
import static java.util.Objects.nonNull;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserEntityRepository userEntityRepository;


    @Override
    public UserEntity findOrCreateUser(String name, String surname, String phone, String email, String address) {
        UserEntity userEntity = userEntityRepository.findByEmail(email);
        if(nonNull(userEntity)){
            return userEntity;
        }
        userEntity = new UserEntity();
        userEntity.setRole(CUSTOMER.name());
        userEntity.setAddress(address);
        userEntity.setName(name);
        userEntity.setPhone(phone);
        userEntity.setPhone(email);
        return userEntityRepository.save(userEntity);
    }
}
