package edu.mum.cs.ea.payment.repository;

import edu.mum.cs.ea.payment.model.Paypal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaypalRepository extends JpaRepository<Paypal, Integer> {
}
