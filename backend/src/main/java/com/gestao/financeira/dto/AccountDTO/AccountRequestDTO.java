package com.gestao.financeira.dto.AccountDTO;

import com.gestao.financeira.entity.enums.TypeAccount;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AccountRequestDTO {
    private Long id;
    public String nome;
    public TypeAccount typeAccount;
    public Long userId;
    public String cpfCnpj;
}
