package edu.mum.cs.ea.payment.service.impl;

import edu.mum.cs.ea.payment.model.BankAccount;
import edu.mum.cs.ea.payment.model.Payment;
import edu.mum.cs.ea.payment.service.BankAccountService;
import org.springframework.stereotype.Service;

@Service
public class BankAccountServiceImpl implements BankAccountService {
    @Override
    public Boolean processPayment(BankAccount bankAccount, Payment payment) {
        return true;
    }
}
