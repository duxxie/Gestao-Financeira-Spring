package com.gestao.financeira.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestao.financeira.entity.model.FinancialTransaction;

@Repository
public interface TransactionRepository extends JpaRepository<FinancialTransaction, Long> {

    public List<FinancialTransaction> findAll();
    public List<FinancialTransaction> findByUserId(Long userId);
    public List<FinancialTransaction> findByAccountId(Long accountId);
}
