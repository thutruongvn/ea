package edu.mum.cs.ea.payment.service;

import edu.mum.cs.ea.payment.model.CreditCard;
import edu.mum.cs.ea.payment.model.Payment;

public interface CreditCardService {
    public Boolean processPayment(CreditCard creditCard, Payment payment);
}
