package com.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.helper.JsonResponse;
import com.models.User;
import com.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> index() {
        return repository.findAll();
    }

    public JsonResponse getAll() {
        List<Object> users = new ArrayList<>();
        users.addAll(repository.findAll());

        return new JsonResponse(true, "Data successfully retrieved", users, 1, 200);
    }

    public JsonResponse find(Integer userId) {
        Optional<User> users = repository.findById(userId);
        User user = Optional.ofNullable(users.get()).orElse(new User());
        List<Object> listData = new ArrayList<>();
        listData.add(user);

        return new JsonResponse(true, "Data successfully retrieved", listData, 1, 200);
    }
}
