package edu.mum.cs.ea.order.controller;

import edu.mum.cs.ea.order.model.Order;
import edu.mum.cs.ea.order.repository.OrderRepository;
import edu.mum.cs.ea.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;


    @PostMapping
    public @ResponseBody Order createOrder(@RequestBody Order order) {
        return orderService.processOrder(order);
    }

    @GetMapping("/{id}")
    public @ResponseBody Order findOrderById(@PathVariable Long id) {
        return orderService.getById(id);
    }
}
