package com.example.bluelion.Controller;


import com.example.bluelion.Model.Transactions;
import com.example.bluelion.Repositories.TransactionRepository;
import com.example.bluelion.Services.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;

@Controller
@RequestMapping(path = "/BlueLion")
public class TransactionsController {
    
    @Autowired
    private TransactionsService transactionsService;
    @RequestMapping(path = "/transactions", produces = {"application/json"}, method = RequestMethod.GET)
    public @ResponseBody Collection<Transactions> getAllTransactions(){
        return transactionsService.findAll();
    }

    @RequestMapping(path = "/transactions/createNew", produces = {"application/json"}, method = RequestMethod.POST)
    public ResponseEntity<Transactions> createTransaction(@RequestBody Transactions transactions){
        try {
            transactionsService.saveTransaction(transactions);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            throw new ResponseStatusException( HttpStatus.BAD_REQUEST, "Required properties are missing", e);
        }
    }

}
