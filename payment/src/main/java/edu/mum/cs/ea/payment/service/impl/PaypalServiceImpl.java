package edu.mum.cs.ea.payment.service.impl;

import edu.mum.cs.ea.payment.model.Payment;
import edu.mum.cs.ea.payment.model.Paypal;
import edu.mum.cs.ea.payment.service.PaypalService;
import org.springframework.stereotype.Service;

@Service
public class PaypalServiceImpl implements PaypalService {
    @Override
    public Boolean processPayment(Paypal paypal, Payment payment) {
        return true;
    }
}
