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


    @Query("SELECT t FROM Transaction t WHERE t.quantity > :quantity")
    List<Transaction> findTransactionsGreaterThanInputJPQL(@Param("quantity") int quantity);


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO transaction (product_id, quantity) VALUES (:productId, :quantity)", nativeQuery = true)
    void insertTransaction(@Param("productId") Long productId, @Param("quantity") int quantity);


    @Modifying
    @Transactional
    /* karena ingin menampilkan nama produk maka harus menggunakan select
    untuk memilih data yang akan dimasukkan ke dalam tabel Transaction dari tabel Product. */
    @Query("INSERT INTO Transaction (product, quantity, transactionDate) " +
            "SELECT p, :quantity, CURRENT_TIMESTAMP FROM Product p WHERE p.productId = :productId")
    void insertTransactionJPQL(@Param("productId") Long productId, @Param("quantity") int quantity);


}

