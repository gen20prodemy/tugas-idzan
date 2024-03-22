package com.example.gen20javaspringbootpos.service;

import com.example.gen20javaspringbootpos.dto.TransactionDTO;
import com.example.gen20javaspringbootpos.entity.Transaction;
import com.example.gen20javaspringbootpos.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public void createTransaction(TransactionDTO transactionDTO) {
        transactionRepository.insertTransaction(transactionDTO.getProductId(),
                transactionDTO.getQuantity());
    }


    // Metode utilitas untuk mengonversi entity menjadi DTO
    private TransactionDTO convertToDTO(Transaction transaction) {
        return new TransactionDTO(transaction.getTransactionId(), transaction.getProductId(),
                transaction.getProduct().getName() , transaction.getQuantity());
    }


    public List<TransactionDTO> getAllTransactions() {
        List<Transaction> transactions = transactionRepository.findAll();
        return transactions.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }


    public List<TransactionDTO> findTransactionsGreaterThan10() {
        List<Transaction> transactions = transactionRepository.findTransactionsGreaterThan10();
        return transactions.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }





}

