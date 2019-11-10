package edu.mum.cs.ea.order.controller;

import edu.mum.cs.ea.order.model.Order;
import edu.mum.cs.ea.order.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private OrderRepository repo;

    @Autowired
    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return repo.save(order);
    }

    @GetMapping("/{id}")
    public Optional<Order> findOrderById(@PathVariable Long id) {
        return repo.findById(id);
    }
}
