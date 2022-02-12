package com.mg.orderservice.dao;

import com.mg.orderservice.order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDAO extends MongoRepository<Order, Long> {
    public List<Order> getByUserId(Long id);
}
