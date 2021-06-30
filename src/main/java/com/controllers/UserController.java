package com.controllers;

import com.exceptions.ResourceNotFoundException;
import com.helper.JsonResponse;
import com.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService repository;

    @GetMapping("/users")
    public JsonResponse getAll() {
        return repository.getAll();
    }

    @GetMapping("/users/{id}")
    public JsonResponse find(@PathVariable(value = "id") Integer userId) throws ResourceNotFoundException {
        return repository.find(userId);
    }

    // @PostMapping("/users")
    // public User create(@Validated @RequestBody User employee) {
    // return repository.save(employee);
    // }
}
