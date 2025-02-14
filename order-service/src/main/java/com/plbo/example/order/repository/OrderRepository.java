package com.plbo.example.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plbo.example.order.model.Order;

public interface OrderRepository extends JpaRepository<Order,  Long> {

    
} 
