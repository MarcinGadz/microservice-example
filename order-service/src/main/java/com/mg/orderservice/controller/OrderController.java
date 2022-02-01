package com.mg.orderservice.controller;

import com.mg.orderservice.order.Order;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/order")
public class OrderController {
    @GetMapping
    public List<Order> getList() {
        return null;
    }

    @PostMapping
    public Order add(@RequestBody Order order) {
        return order;
    }

    @GetMapping("/{orderId}")
    public List<String> getOrders(@PathVariable String orderId) {
        return null;
    }
}
