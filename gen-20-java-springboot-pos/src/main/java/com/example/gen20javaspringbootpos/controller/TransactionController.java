package com.example.gen20javaspringbootpos.controller;

import com.example.gen20javaspringbootpos.dto.TransactionDTO;
import com.example.gen20javaspringbootpos.responseHandler.GlobalHttpResponse;
import com.example.gen20javaspringbootpos.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public GlobalHttpResponse<Void> createTransaction(@RequestBody TransactionDTO transactionDTO) {
        transactionService.createTransaction(transactionDTO);
        return new GlobalHttpResponse<>(HttpStatus.CREATED.value(), "Transaksi berhasil dibuat", null);
    }

    @GetMapping
    public GlobalHttpResponse<List<TransactionDTO>> getAllTransactions() {
        return new GlobalHttpResponse<>
                (HttpStatus.OK.value(), "Semua transaksi berhasil diambil",
                        transactionService.getAllTransactions());
    }

    @GetMapping("/greaterthan10")
    public GlobalHttpResponse<List<TransactionDTO>> findTransactionsGreaterThan10() {
        return new GlobalHttpResponse<>
                (HttpStatus.OK.value(), "Semua transaksi yang lebih dari 10 berhasil diambil",
                transactionService.findTransactionsGreaterThan10());
    }
}

