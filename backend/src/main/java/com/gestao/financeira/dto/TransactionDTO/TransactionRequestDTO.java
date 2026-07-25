package com.gestao.financeira.dto.TransactionDTO;

import com.gestao.financeira.entity.enums.TypeOfTransaction;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class TransactionRequestDTO {
    private Long id;
    public String description;
    public BigDecimal value;
    public TypeOfTransaction type;
    public LocalDateTime date;
    public Long userId;
    public Long accountId;
}
