package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.models.TransactionHistory;
import com.ludowica.salesapi.repository.TransactionHistoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/history")
public class TransactionHistoryController {

    @Autowired
    TransactionHistoryRepo transactionHistoryRepo;

    @GetMapping
    public List<TransactionHistory> getAllTransactions(){
        return transactionHistoryRepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TransactionHistory> getTransaction(@PathVariable int id){
        return transactionHistoryRepo.findById(id);
    }

    @PostMapping
    public TransactionHistory addTransaction(@RequestBody TransactionHistory history){
        return transactionHistoryRepo.save(history);
    }
}
