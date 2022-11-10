package com.Project.pms.Placed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class GetPlacedApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetPlacedApplication.class, args);
		System.out.println("Please Get Placed Soon ");
	}

}
