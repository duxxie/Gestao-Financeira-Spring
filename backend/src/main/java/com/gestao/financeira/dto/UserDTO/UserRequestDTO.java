package com.gestao.financeira.dto.UserDTO;

import com.gestao.financeira.entity.enums.UserRole;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserRequestDTO {
    private Long id;
    public String name;
    public String email;
    public String password;
    public String cpf;
    public UserRole role;
}