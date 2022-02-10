package com.mg.orderservice.service;

import com.mg.orderservice.order.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    // TODO
    // finish controller, add support to service layer
    // add service discovery microservice
    // add support for service discovery
    // add support for docker
    // run and test
    private List<Order> orders = new ArrayList<>();
    public Order add(Order o) {
        orders.add(o);
        return o;
    }
    public List<Order> getAll() {
        return List.copyOf(orders);
    }
    public Order getById(String id) {
        return orders.stream().filter(o -> o.getOrderId().equals(id)).findFirst().orElse(null);
    }
}
