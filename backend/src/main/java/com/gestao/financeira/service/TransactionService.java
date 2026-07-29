package com.gestao.financeira.service;

import java.util.List;

import com.gestao.financeira.dto.TransactionDTO.TransactionRequestDTO;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestao.financeira.dto.TransactionDTO.TransactionResponseDTO;
import com.gestao.financeira.entity.model.FinancialTransaction;
import com.gestao.financeira.mapper.TransactionMapper;
import com.gestao.financeira.repository.TransactionRepository;

@Service
public class TransactionService {
    
    @Autowired
    public TransactionRepository transactionRepository;

    @Autowired
    public TransactionMapper transactionMapper;
    
    public List<TransactionResponseDTO> findAll() {
        List<FinancialTransaction> financialTransactions = transactionRepository.findAll();
        return financialTransactions.stream().map(transactionMapper::toDTO).toList();
    }

    public List<TransactionResponseDTO> findByUserId(Long userId) {
        List<FinancialTransaction> financialTransactions = transactionRepository.findByUserId(userId);
        return financialTransactions.stream().map(transactionMapper::toDTO).toList();
    }

    public List<TransactionResponseDTO> findByAccountId(Long accountId) {
        List<FinancialTransaction> financialTransactions = transactionRepository.findByAccountId(accountId);
        return financialTransactions.stream().map(transactionMapper::toDTO).toList();
    }

    public TransactionResponseDTO insertTransaction(TransactionRequestDTO dto) {
        FinancialTransaction financialTransaction = transactionMapper.toEntity(dto);
        FinancialTransaction financialTransactionSaved = transactionRepository.save(financialTransaction);
        return transactionMapper.toDTO(financialTransactionSaved);
    }

    public TransactionResponseDTO updateTransaction(TransactionRequestDTO dto) {
        FinancialTransaction financialTransaction = transactionMapper.toEntity(dto);
        FinancialTransaction financialTransactionSaved = transactionRepository.save(financialTransaction);
        return transactionMapper.toDTO(financialTransactionSaved);
    }

    @Transactional
    public TransactionResponseDTO deleteTransaction(Long id) {
        FinancialTransaction financialTransaction = transactionRepository.findById(id).orElse(null);
        transactionRepository.delete(financialTransaction);
        return transactionMapper.toDTO(financialTransaction);
    }
}
