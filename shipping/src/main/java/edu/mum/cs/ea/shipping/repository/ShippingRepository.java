package edu.mum.cs.ea.shipping.repository;

import edu.mum.cs.ea.shipping.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends JpaRepository<Shipping, Long> {
}
