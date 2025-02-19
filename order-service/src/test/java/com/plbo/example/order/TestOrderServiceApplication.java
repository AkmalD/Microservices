package com.plbo.example.order;

import org.springframework.boot.SpringApplication;

import com.plbo.microservices.order.OrderServiceApplication;

public class TestOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(OrderServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
