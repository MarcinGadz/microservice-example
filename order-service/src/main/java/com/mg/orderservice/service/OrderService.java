package com.mg.orderservice.service;

import com.mg.orderservice.dao.OrderDAO;
import com.mg.orderservice.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class OrderService {

    @PostConstruct
    private void addTestOrder() {
        Order o = new Order();
        o.setOrderId(23L);
        o.setUserId(1L);
        o.setSummary("Test order");
        add(o);
    }

    @Autowired
    private OrderDAO orderDAO;

    public Order add(Order o) {
        orderDAO.save(o);
        return o;
    }

    public List<Order> getAll() {
        return orderDAO.findAll();
    }

    public Order getById(Long id) {
        return orderDAO.findById(id).orElse(null);
    }

    public List<Order> getByUser(Long userId) {
        return orderDAO.getByUserId(userId);
    }
}
