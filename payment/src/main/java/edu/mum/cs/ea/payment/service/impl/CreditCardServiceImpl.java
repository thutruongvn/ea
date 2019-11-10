package edu.mum.cs.ea.payment.service.impl;

import edu.mum.cs.ea.payment.model.CreditCard;
import edu.mum.cs.ea.payment.model.Payment;
import edu.mum.cs.ea.payment.service.CreditCardService;
import org.springframework.stereotype.Service;

@Service
public class CreditCardServiceImpl implements CreditCardService {
    @Override
    public Boolean processPayment(CreditCard creditCard, Payment payment) {
        return true;
    }
}
