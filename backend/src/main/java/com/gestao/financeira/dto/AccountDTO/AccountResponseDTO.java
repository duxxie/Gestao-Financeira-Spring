package com.gestao.financeira.dto.AccountDTO;

import com.gestao.financeira.entity.enums.TypeAccount;

import java.math.BigDecimal;

public class AccountResponseDTO {
    private Long id;
    public String nome;
    public TypeAccount typeAccount;
    public BigDecimal saldo;
    public Long userId;
}
