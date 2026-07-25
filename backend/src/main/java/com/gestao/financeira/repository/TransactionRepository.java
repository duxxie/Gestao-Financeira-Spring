package com.gestao.financeira.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestao.financeira.entity.model.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    public List<Transaction> findAll();
    public List<Transaction> findByUserId(Long userId);
    public List<Transaction> findByAccountId(Long accountId);
    public List<Transaction> findByNameContainingIgnoreCase(String name);
}
