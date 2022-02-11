package com.mg.userservice.service;

import com.mg.userservice.model.Order;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService {
    public Order addOrder(Order o) {
        return o;
    }
    public List<Order> getByUser(Long userId) {
        return Collections.emptyList();
    }

}
