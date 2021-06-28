package com.controllers;

import java.util.List;

import com.exceptions.ResourceNotFoundException;
import com.models.User;
import com.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    public List<User> index() {
        return repository.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> find(@PathVariable(value = "id") Integer userId) throws ResourceNotFoundException {
        User user = repository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/users")
    public User create(@Validated @RequestBody User employee) {
        return repository.save(employee);
    }

}
