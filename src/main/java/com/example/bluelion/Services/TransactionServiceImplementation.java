package com.example.bluelion.Services;

import com.example.bluelion.Model.Transactions;
import com.example.bluelion.Repositories.TransactionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class TransactionServiceImplementation implements TransactionsService{

    private final TransactionRepository transactionRepository;

    @Override
    public Transactions saveTransaction(Transactions transactions) {
        return transactionRepository.save(transactions);
    }

    @Override
    public Collection<Transactions> findAll(){
        return transactionRepository.findAll();
    }
}
