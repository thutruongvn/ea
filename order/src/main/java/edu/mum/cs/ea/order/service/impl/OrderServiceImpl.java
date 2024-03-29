package edu.mum.cs.ea.order.service.impl;

import edu.mum.cs.ea.order.model.Order;
import edu.mum.cs.ea.order.repository.OrderRepository;
import edu.mum.cs.ea.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Order getById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    @Override
    public Order processOrder(Order order) {
        return orderRepository.save(order);
    }
}
