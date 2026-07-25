package com.gestao.financeira.mapper;

import com.gestao.financeira.dto.TransactionDTO.TransactionResponseDTO;
import org.mapstruct.Mapper;

import com.gestao.financeira.dto.TransactionDTO.TransactionRequestDTO;
import com.gestao.financeira.entity.model.Transaction;

@Mapper
public interface TransactionMapper {
    Transaction toEntity(TransactionRequestDTO transactionRequestDTO);
    TransactionResponseDTO toDTO(Transaction transaction);
}
