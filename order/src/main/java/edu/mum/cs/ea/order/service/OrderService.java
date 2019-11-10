package edu.mum.cs.ea.order.service;

import edu.mum.cs.ea.order.model.Order;

public interface OrderService {
    public Order getById(Long id);

    public Order processOrder(Order order);
}
