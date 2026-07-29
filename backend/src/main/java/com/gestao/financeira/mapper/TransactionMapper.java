package com.gestao.financeira.mapper;

import com.gestao.financeira.dto.TransactionDTO.TransactionResponseDTO;
import org.mapstruct.Mapper;

import com.gestao.financeira.dto.TransactionDTO.TransactionRequestDTO;
import com.gestao.financeira.entity.model.FinancialTransaction;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    FinancialTransaction toEntity(TransactionRequestDTO transactionRequestDTO);
    TransactionResponseDTO toDTO(FinancialTransaction financialTransaction);
}
