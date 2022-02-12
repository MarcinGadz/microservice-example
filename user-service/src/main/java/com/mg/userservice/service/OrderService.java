package com.mg.userservice.service;

import com.mg.userservice.model.Order;
import com.mg.userservice.util.OrderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderFeignClient orderFeignClient;

    public Order addOrder(Order o) {
        return orderFeignClient.addOrder(o);
    }
    public List<Order> getByUser(Long userId) {
        return orderFeignClient.getByUser(userId);
    }
}
