package com.mg.userservice.user;

import java.util.ArrayList;
import java.util.List;

public class User {
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
