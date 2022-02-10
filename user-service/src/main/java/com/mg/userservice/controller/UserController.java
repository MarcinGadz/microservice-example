package com.mg.userservice.controller;

import com.mg.userservice.model.Order;
import com.mg.userservice.service.UserService;
import com.mg.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/user")
public class UserController {

    /***
     TODO
     -- addUser
     -- getUser
     -- getUserList
     -- add order to user
     -- get user order
     -- get list of user orders
     */

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUserList() {
        return userService.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User u) {
        return userService.addUser(u);
    }

    @GetMapping("/{username}/orders")
    public List<Order> getOrders(@PathVariable String username) {
        return userService.getUserOrders();
    }

    @PostMapping("/{username}/order")
    public Order addOrder(@PathVariable String username,
                           @RequestBody Order order) {
        return userService.addOrder(username, order);
    }
}
