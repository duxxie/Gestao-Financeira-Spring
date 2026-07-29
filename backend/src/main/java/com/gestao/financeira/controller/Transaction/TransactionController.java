package com.gestao.financeira.controller.Transaction;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestao.financeira.dto.TransactionDTO.TransactionRequestDTO;
import com.gestao.financeira.dto.TransactionDTO.TransactionResponseDTO;
import com.gestao.financeira.service.TransactionService;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    
    @Autowired
    public TransactionService transactionService;

    @GetMapping
    public List<TransactionResponseDTO> findAll() {
        return transactionService.findAll();
    }

    @GetMapping("/user/{userId}")
    public List<TransactionResponseDTO> findByUserId(@RequestParam Long userId) {
        return transactionService.findByUserId(userId);
    }

    @GetMapping("/account/{accountId}")
    public List<TransactionResponseDTO> findByAccountId(@RequestParam Long accountId) {
        return transactionService.findByAccountId(accountId);
    }

    @PostMapping
    public TransactionResponseDTO insertTransaction(@RequestBody TransactionRequestDTO dto) {
        return transactionService.insertTransaction(dto);
    }

    @PutMapping
    public TransactionResponseDTO updateTransaction(@RequestBody TransactionRequestDTO dto) {
        return transactionService.updateTransaction(dto);
    }

    @DeleteMapping("/{id}")
    public TransactionResponseDTO deleteTransaction(@RequestParam Long id) {
        return transactionService.deleteTransaction(id);
    }
}
