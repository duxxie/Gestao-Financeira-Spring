package com.gestao.financeira.entity.model;

import com.gestao.financeira.entity.enums.TypeAccount;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String nome;
    public TypeAccount typeAccount;
    public BigDecimal saldo;

    @OneToOne(cascade = CascadeType.ALL)
    public Long userId;
    public String cpfCnpj;
}
