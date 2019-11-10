package edu.mum.cs.ea.order.repository;

import edu.mum.cs.ea.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
