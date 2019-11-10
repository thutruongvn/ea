package edu.mum.cs.ea.payment.service.impl;

import edu.mum.cs.ea.payment.model.BankAccount;
import edu.mum.cs.ea.payment.model.CreditCard;
import edu.mum.cs.ea.payment.model.Payment;
import edu.mum.cs.ea.payment.model.Paypal;
import edu.mum.cs.ea.payment.repository.PaymentRepository;
import edu.mum.cs.ea.payment.service.BankAccountService;
import edu.mum.cs.ea.payment.service.CreditCardService;
import edu.mum.cs.ea.payment.service.PaymentService;
import edu.mum.cs.ea.payment.service.PaypalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private PaypalService paypalService;
    @Autowired
    private BankAccountService bankAccountService;
    @Autowired
    private CreditCardService creditCardService;

    @Override
    public Payment createPayment(Payment payment) {
        switch (payment.getPaymentType()){
            case Paypal:
                payment.setSuccessStatus(paypalService.processPayment(new Paypal(), payment));
                break;
            case BankAccount:
                payment.setSuccessStatus(bankAccountService.processPayment(new BankAccount(), payment));
                break;
            case CreditCard:
                payment.setSuccessStatus(creditCardService.processPayment(new CreditCard(), payment));
                break;
        }
        return paymentRepository.save(payment);
    }
}
