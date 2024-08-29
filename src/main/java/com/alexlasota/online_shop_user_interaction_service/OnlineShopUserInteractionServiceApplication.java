package com.alexlasota.online_shop_user_interaction_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OnlineShopUserInteractionServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(OnlineShopUserInteractionServiceApplication.class, args);
	}
}
