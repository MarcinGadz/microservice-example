package com.mg.userservice.controller;

import com.mg.userservice.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/user")
public class UserController {
    private List<User> userList;

    @GetMapping
    public List<User> getUserList() {
        return userList;
    }

    @PostMapping
    public User addUser(@RequestBody User u) {

        if (u.getUsername() == null) return null;
        if (userList.stream().anyMatch(obj -> obj.getUsername().equals(u.getUsername()))) return null;

        userList.add(u);
        return u;
    }

    @GetMapping("/{username}")
    public List<String> getOrders(@PathVariable String username) {
        User u = userList.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElseThrow();
        return u.getOrders();
    }
    @PutMapping("/{username}/{orderId}")
    public String addOrder(@PathVariable String username,
                           @PathVariable String orderId) {
        User u = userList.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElseThrow();
        u.addOrder(orderId);
        return orderId;
    }
}
