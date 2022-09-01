package com.example.bluelion.Services;

import com.example.bluelion.Model.Transactions;

import java.util.Collection;

public interface TransactionsService {

    Transactions saveTransaction(Transactions transactions);
    Collection<Transactions> findAll();
}
