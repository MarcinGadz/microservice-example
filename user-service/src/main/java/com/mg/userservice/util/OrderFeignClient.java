package com.mg.userservice.util;

import com.mg.userservice.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
@FeignClient("order-service")
public interface OrderFeignClient {
    @RequestMapping(
            method = RequestMethod.GET,
            value = "/order/{userId}",
            consumes = "application/json")
    List<Order> getByUser(@PathVariable("userId") Long userId);

    @RequestMapping(
            method = RequestMethod.POST,
            value = "/order",
            produces = "application/json",
            consumes = "application/json")
    Order addOrder(Order o);
}
