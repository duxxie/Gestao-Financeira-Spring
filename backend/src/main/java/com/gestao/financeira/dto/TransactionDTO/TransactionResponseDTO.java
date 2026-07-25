package com.gestao.financeira.dto.TransactionDTO;

import com.gestao.financeira.entity.enums.TypeOfTransaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionResponseDTO {
    private Long id;
    public String description;
    public BigDecimal value;
    public TypeOfTransaction type;
    public LocalDateTime date;
    public Long userId;
    public Long accountId;
}
