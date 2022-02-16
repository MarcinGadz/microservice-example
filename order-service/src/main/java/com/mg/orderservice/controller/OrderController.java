package com.mg.orderservice.controller;

import com.mg.orderservice.order.Order;
import com.mg.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Autowired
    private OrderService service;

    @GetMapping
    public List<Order> getList() {
        return service.getAll();
    }

    @PostMapping
    public Order add(@RequestBody Order order) {
        return service.add(order);
    }

    @GetMapping("/{orderId}")
    public Order getOrders(@PathVariable Long orderId) {
        return service.getById(orderId);
    }

    @GetMapping("/user/{userId}")
    public List<Order> getByUserId(@PathVariable Long userId) {
        return service.getByUser(userId);
    }
}
