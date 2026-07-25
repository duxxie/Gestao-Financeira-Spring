package com.gestao.financeira.service;

import java.util.List;

import com.gestao.financeira.dto.TransactionDTO.TransactionRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestao.financeira.dto.TransactionDTO.TransactionResponseDTO;
import com.gestao.financeira.entity.model.Transaction;
import com.gestao.financeira.mapper.TransactionMapper;
import com.gestao.financeira.repository.TransactionRepository;

@Service
public class TransactionService {
    
    @Autowired
    public TransactionRepository transactionRepository;

    @Autowired
    public TransactionMapper transactionMapper;
    
    public List<TransactionResponseDTO> findAll() {
        List<Transaction> transactions = transactionRepository.findAll();
        return transactions.stream().map(transactionMapper::toDTO).toList();
    }

    public List<TransactionResponseDTO> findByUserId(Long userId) {
        List<Transaction> transactions = transactionRepository.findByUserId(userId);
        return transactions.stream().map(transactionMapper::toDTO).toList();
    }

    public List<TransactionResponseDTO> findByAccountId(Long accountId) {
        List<Transaction> transactions = transactionRepository.findByAccountId(accountId);
        return transactions.stream().map(transactionMapper::toDTO).toList();
    }

    public List<TransactionResponseDTO> findByNameContainingIgnoreCase(String name) {
        List<Transaction> transactions = transactionRepository.findByNameContainingIgnoreCase(name);
        return transactions.stream().map(transactionMapper::toDTO).toList();
    }

    public TransactionResponseDTO insertTransaction(TransactionRequestDTO dto) {
        Transaction transaction = transactionMapper.toEntity(dto);
        Transaction transactionSaved = transactionRepository.save(transaction);
        return transactionMapper.toDTO(transactionSaved);
    }

    public TransactionResponseDTO updateTransaction(TransactionRequestDTO dto) {
        Transaction transaction = transactionMapper.toEntity(dto);
        Transaction transactionSaved = transactionRepository.save(transaction);
        return transactionMapper.toDTO(transactionSaved);
    }

    public TransactionResponseDTO deleteTransaction(Long id) {
        Transaction transaction = transactionRepository.findById(id).orElse(null);
        transactionRepository.delete(transaction);
        return transactionMapper.toDTO(transaction);
    }
}
