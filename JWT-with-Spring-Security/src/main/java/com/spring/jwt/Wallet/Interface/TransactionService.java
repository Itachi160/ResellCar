package com.spring.jwt.Wallet.Interface;

import com.spring.jwt.Wallet.Dto.TransactionDTO;

public interface TransactionService {
    TransactionDTO credit(Integer accountId, Double amount);
    TransactionDTO debit(Integer accountId, Double amount);
    TransactionDTO withdraw(Integer accountId, Double amount);
}
