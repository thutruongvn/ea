package edu.mum.cs.ea.payment.service;

import edu.mum.cs.ea.payment.model.Payment;
import edu.mum.cs.ea.payment.model.Paypal;

public interface PaypalService {

    public Boolean processPayment(Paypal paypal, Payment payment);
}
