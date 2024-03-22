package com.example.gen20javaspringbootpos.repository;

import com.example.gen20javaspringbootpos.dto.TransactionDTO;
import com.example.gen20javaspringbootpos.entity.Transaction;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {


    @Query(value = "SELECT t FROM Transaction t WHERE t.quantity > 10")
    List<Transaction> findTransactionsGreaterThan10();


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO transaction (product_id, quantity) VALUES (:productId, :quantity)", nativeQuery = true)
    void insertTransaction(@Param("productId") Long productId, @Param("quantity") int quantity);
}

