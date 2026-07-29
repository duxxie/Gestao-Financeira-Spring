package com.gestao.financeira.entity.model;

import com.gestao.financeira.entity.enums.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "")
    private Long id;
    private String name;
    private String email;
    private String password;
    private String cpf;
    private UserRole role;
}
