package com.plbo.microservices.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plbo.microservices.order.model.Order;

public interface OrderRepository extends JpaRepository<Order,  Long> {

    
} 
