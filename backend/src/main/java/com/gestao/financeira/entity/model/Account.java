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
@Table(name = "tb_account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private TypeAccount typeAccount;
    private BigDecimal saldo;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    private String cpfCnpj;
}
