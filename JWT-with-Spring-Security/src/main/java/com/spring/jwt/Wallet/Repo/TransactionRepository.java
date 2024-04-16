package com.spring.jwt.Wallet.Repo;

import com.spring.jwt.Wallet.Entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
//    List<Transaction> findByAccountId(Integer accountId);
//    List<Transaction> findByType(String type);
//    List<Transaction> findByStatus(String status);
//    List<Transaction> findByLastUpdateTimeBetween(LocalDateTime startDate, LocalDateTime endDate);
}