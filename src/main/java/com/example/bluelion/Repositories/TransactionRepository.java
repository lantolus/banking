package com.example.bluelion.Repositories;

import com.example.bluelion.Model.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transactions, Long> {

}
