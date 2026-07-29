package com.gestao.financeira.mapper;

import com.gestao.financeira.dto.UserDTO.UserRequestDTO;
import com.gestao.financeira.dto.UserDTO.UserResponseDTO;
import com.gestao.financeira.entity.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequestDTO dto);
    UserResponseDTO toDTO(User user);
}
