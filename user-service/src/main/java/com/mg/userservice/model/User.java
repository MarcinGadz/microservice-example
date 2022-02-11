package com.mg.userservice.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class User {
    @Id
    private Long userId;
    @Indexed(unique = true)
    private String username;

    private List<String> orders;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public void addOrder(String id) {
        if (orders == null) orders = new ArrayList<>();
        orders.add(id);
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getOrders() {
        return List.copyOf(orders);
    }

    public void setOrders(List<String> orders) {
        this.orders = orders;
    }
}
