package com.gestao.financeira.repository;

import com.gestao.financeira.entity.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    public List<Account> findByName(String name);
    public List<Account> findByUserId(Long id);
}
