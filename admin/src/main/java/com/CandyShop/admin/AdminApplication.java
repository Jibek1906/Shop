package com.CandyShop.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.CandyShop.library.*", "com.CandyShop.admin.*"})
@EnableJpaRepositories(value = "com.CandyShop.library.repository")
@EntityScan(value = "com.CandyShop.library.model")
public class AdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApplication.class, args);
	}

}
