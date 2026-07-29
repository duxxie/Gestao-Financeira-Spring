package com.gestao.financeira.controller.Account;

import com.gestao.financeira.dto.AccountDTO.AccountRequestDTO;
import com.gestao.financeira.dto.AccountDTO.AccountResponseDTO;
import com.gestao.financeira.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @Autowired
    public AccountService accountService;

    @GetMapping("/search/name")
    public List<AccountResponseDTO> findByName(@RequestParam String name){
        return accountService.findByName(name);
    }

    @GetMapping("/search/{id}")
    public List<AccountResponseDTO> findByUserId(@RequestParam Long userId){
        return accountService.findByUserId(userId);
    }

    @PostMapping
    public AccountResponseDTO save(@RequestBody AccountRequestDTO accountRequestDTO){
        return accountService.insertAccount(accountRequestDTO);
    }

    @PutMapping
    public AccountResponseDTO update(@RequestBody AccountRequestDTO accountRequestDTO){
        return accountService.updateAccount(accountRequestDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteById(@PathVariable Long id){
        accountService.deleteAccount(id);
        return ResponseEntity.ok("Successfully deleted" + id);
    }

}
