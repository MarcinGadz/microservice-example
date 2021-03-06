package com.mg.userservice.service;

import com.mg.userservice.dao.UserDAO;
import com.mg.userservice.model.Order;
import com.mg.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class UserService {


    @PostConstruct
    private void addUsers() {
        User u = new User();
        u.setUserId(1L);
        u.setUsername("test");
        addUser(u);
    }

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
