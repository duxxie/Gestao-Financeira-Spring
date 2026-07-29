package com.gestao.financeira.service;

import com.gestao.financeira.dto.UserDTO.UserRequestDTO;
import com.gestao.financeira.dto.UserDTO.UserResponseDTO;
import com.gestao.financeira.entity.model.User;
import com.gestao.financeira.mapper.UserMapper;
import com.gestao.financeira.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    public UserMapper userMapper;

    public List<UserResponseDTO> findAll() {
        List<User> users = userRepository.findAll();
        return users.stream().map(userMapper::toDTO).toList();
    }

    public List<UserResponseDTO> findByName(String username) {
        List<User> users = userRepository.findByName(username);
        return users.stream().map(userMapper::toDTO).toList();
    }

    public List<UserResponseDTO> findByEmail(String email) {
        List<User> users = userRepository.findByEmail(email);
        return users.stream().map(userMapper::toDTO).toList();
    }

    public List<UserResponseDTO> findByCpf(String cpf) {
        List<User> users = userRepository.findByCpf(cpf);
        return users.stream().map(userMapper::toDTO).toList();
    }

    public UserResponseDTO insertUser(UserRequestDTO dto){
        User user = userMapper.toEntity(dto);
        User userSaved = userRepository.save(user);
        return userMapper.toDTO(userSaved);
    }

    public UserResponseDTO updateUser(UserRequestDTO dto){
        User user = userMapper.toEntity(dto);
        User userSaved = userRepository.save(user);
        return userMapper.toDTO(userSaved);
    }

    @Transactional
    public UserResponseDTO deleteUser(Long id){
        User user = userRepository.findById(id).get();
        userRepository.delete(user);
        return userMapper.toDTO(user);
    }
}
