package com.gestao.financeira.service;

import com.gestao.financeira.dto.AccountDTO.AccountRequestDTO;
import com.gestao.financeira.dto.AccountDTO.AccountResponseDTO;
import com.gestao.financeira.entity.model.Account;
import com.gestao.financeira.mapper.AccountMapper;
import com.gestao.financeira.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AccountMapper accountMapper;

    public List<AccountResponseDTO> findAll() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().map(accountMapper::toResponseDTO).toList();
    }

    public List<AccountResponseDTO> findByName(String name){
        List<Account> accounts = accountRepository.findByName(name);
        return accounts.stream().map(accountMapper::toResponseDTO).toList();
    }

    public List<AccountResponseDTO> findByUserId(Long id){
        List<Account> accounts = accountRepository.findByUserId(id);
        return accounts.stream().map(accountMapper::toResponseDTO).toList();
    }

    public AccountResponseDTO insertAccount(AccountRequestDTO dto){
        Account account = accountMapper.toEntity(dto);
        Account accountSaved = accountRepository.save(account);

        return accountMapper.toResponseDTO(accountSaved);
    }

    public AccountResponseDTO updateAccount(AccountRequestDTO dto){
        Account account = accountMapper.toEntity(dto);
        Account accountSaved = accountRepository.save(account);
        return accountMapper.toResponseDTO(accountSaved);
    }

    public AccountResponseDTO deleteAccount(Long id){
        Account account = accountRepository.getOne(id);
        accountRepository.delete(account);
        return accountMapper.toResponseDTO(account);
    }
}
