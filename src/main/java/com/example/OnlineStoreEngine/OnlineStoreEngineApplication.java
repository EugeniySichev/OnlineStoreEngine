package com.example.OnlineStoreEngine;

import com.example.OnlineStoreEngine.entity.UserEntity;
import com.example.OnlineStoreEngine.repository.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class OnlineStoreEngineApplication {

	@Autowired
	private UserEntityRepository userEntityRepository;

	public static void main(String[] args) { SpringApplication.run(OnlineStoreEngineApplication.class, args); }

	@EventListener(ApplicationReadyEvent.class)
	public void testRepository(){
		UserEntity u = new UserEntity();
		u.setAddress("address");
		u.setName("name");
		u.setPhone("phone");
		userEntityRepository.save(u);
	}

}
