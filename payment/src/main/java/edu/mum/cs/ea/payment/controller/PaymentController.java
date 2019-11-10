package edu.mum.cs.ea.payment.controller;

import edu.mum.cs.ea.payment.model.Payment;
import edu.mum.cs.ea.payment.service.PaymentService;
import edu.mum.cs.ea.payment.service.PaypalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public @ResponseBody
    Payment processPayment(@RequestBody Payment payment){
        return paymentService.createPayment(payment);
    }
}
