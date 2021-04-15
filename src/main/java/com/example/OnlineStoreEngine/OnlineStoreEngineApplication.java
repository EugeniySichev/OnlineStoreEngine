package com.example.OnlineStoreEngine;

import com.example.OnlineStoreEngine.entity.UserEntity;
import com.example.OnlineStoreEngine.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class OnlineStoreEngineApplication {



	public static void main(String[] args) { SpringApplication.run(OnlineStoreEngineApplication.class, args); }

//	@EventListener(ApplicationReadyEvent.class)
//	public void testRepository(){
//		UserEntity u = new UserEntity();
//		u.setAddress("address");
//		u.setName("name");
//		u.setPhone("phone");
//		u.setEmail("email");
//		userEntityRepository.save(u);
	}

