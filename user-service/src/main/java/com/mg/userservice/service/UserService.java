package com.mg.userservice.service;

import com.mg.userservice.dao.UserDAO;
import com.mg.userservice.model.Order;
import com.mg.userservice.model.User;
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

    private UserDAO userDAO;

    public User addUser(User u) {
        if (u.getUsername() == null) return null;
        return userDAO.save(u);
    }
    public User getById(Long id) {
        return userDAO.findById(id).orElse(null);
    }
    public List<User> findAll() {
        return userDAO.findAll();
    }


    public Order addOrder(String username, Order order) {
        //TODO
        return null;
    }

    public List<Order> getUserOrders() {
        //TODO
        return null;
    }
}
