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
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "")
    private Long id;
    public String name;
    public String email;
    public String password;
    public String cpf;
    public UserRole role;
}
