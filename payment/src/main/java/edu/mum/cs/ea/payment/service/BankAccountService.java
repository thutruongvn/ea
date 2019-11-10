package edu.mum.cs.ea.payment.service;

import edu.mum.cs.ea.payment.model.BankAccount;
import edu.mum.cs.ea.payment.model.Payment;

public interface BankAccountService {
    public Boolean processPayment(BankAccount bankAccount, Payment payment);
}
