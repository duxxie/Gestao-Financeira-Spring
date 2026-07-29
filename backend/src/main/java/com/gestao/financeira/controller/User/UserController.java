package com.gestao.financeira.controller.User;

import com.gestao.financeira.dto.UserDTO.UserRequestDTO;
import com.gestao.financeira.dto.UserDTO.UserResponseDTO;
import com.gestao.financeira.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserResponseDTO> findAll(){
        return userService.findAll();
    }

    @GetMapping("/search/name")
    public List<UserResponseDTO> findByName(@RequestParam String name){
        return userService.findByName(name);
    }

    @GetMapping("/search/email")
    public List<UserResponseDTO> findByEmail(@RequestParam String email){
        return userService.findByEmail(email);
    }

    @GetMapping("search/cpf")
    public List<UserResponseDTO> findByCpf(@RequestParam String cpf){
        return userService.findByCpf(cpf);
    }

    @PostMapping
    public UserResponseDTO insertUser(@RequestBody UserRequestDTO dto){
        return userService.insertUser(dto);
    }

    @PutMapping
    public UserResponseDTO updateUser(@RequestBody UserRequestDTO dto){
        return userService.updateUser(dto);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@RequestParam Long id){
        userService.deleteUser(id);
    }

}
