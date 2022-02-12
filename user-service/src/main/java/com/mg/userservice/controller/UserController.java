package com.mg.userservice.controller;

import com.mg.userservice.model.Order;
import com.mg.userservice.service.UserService;
import com.mg.userservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/***
 * TODO create docker-compose with database
 * TODO create some init data in scripts
 */
@RequestMapping("/user")
@RestController
public class UserController {

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
        return userService.getUserOrders(username);
    }

    @PostMapping("/{username}/order")
    public Order addOrder(@PathVariable String username,
                           @RequestBody Order order) {
        return userService.addOrder(username, order);
    }
}
