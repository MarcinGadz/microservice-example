package com.mg.userservice.service;

import com.mg.userservice.dao.UserDAO;
import com.mg.userservice.model.Order;
import com.mg.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    /***
     TODO
     -- add order to user
     -- get list of user orders
     -- add database
     */

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private OrderService orderService;

    public User addUser(User u) {
        if (u.getUsername() == null) return null;
        return userDAO.save(u);
    }

    public User getById(Long id) {
        return userDAO.findById(id).orElse(null);
    }

    public User getByUsername(String username) {
        return userDAO.findByUsername(username);
    }

    public List<User> findAll() {
        return userDAO.findAll();
    }


    public Order addOrder(String username, Order order) {
        User client = getByUsername(username);
        order.setUserId(client.getUserId());
        return orderService.addOrder(order);
    }

    public List<Order> getUserOrders(String username) {
        User client = getByUsername(username);
        return orderService.getByUser(client.getUserId());
    }
}
