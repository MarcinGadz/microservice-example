package com.mg.orderservice.controller;

import com.mg.orderservice.order.Order;
import com.mg.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/order")
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
    public Order getOrders(@PathVariable String orderId) {
        return service.getById(orderId);
    }
}
