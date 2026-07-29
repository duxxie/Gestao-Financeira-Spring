package com.gestao.financeira.mapper;

import com.gestao.financeira.dto.AccountDTO.AccountRequestDTO;
import com.gestao.financeira.dto.AccountDTO.AccountResponseDTO;
import com.gestao.financeira.entity.model.Account;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {
    Account toEntity(AccountRequestDTO dto);
    AccountResponseDTO toResponseDTO(Account account);
}