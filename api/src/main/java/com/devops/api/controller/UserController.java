package com.devops.api.controller;

import com.devops.api.model.UserModel;     // ← Import correto da entidade
import com.devops.api.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<UserModel> create(@RequestBody UserModel user) {
        UserModel saved = repository.save(user);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<UserModel>> list() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/health")
    public String health() {
        return "API VERSION 2";
    }

}