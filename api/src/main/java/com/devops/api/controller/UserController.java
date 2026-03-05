package com.devops.api.controller;

import com.devops.api.dto.UserDTO;
import com.devops.api.model.UserModel;
import com.devops.api.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@Valid @RequestBody UserDTO userDto) {
        UserModel user = new UserModel();
        user.setName(userDto.name());
        user.setEmail(userDto.email());

        UserModel saved = repository.save(user);

        return ResponseEntity.ok(new UserDTO(saved.getName(), saved.getEmail()));
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> list() {
        List<UserDTO> users = repository.findAll().stream()
                .map(user -> new UserDTO(user.getName(), user.getEmail()))
                .collect(Collectors.toList());

        return ResponseEntity.ok(users);
    }

    @GetMapping("/exists/{email}")
    public ResponseEntity<Boolean> checkEmailExists(@PathVariable String email) {
        boolean exists = repository.existsByEmail(email);
        return ResponseEntity.ok(exists);
    }
}