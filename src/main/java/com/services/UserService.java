package com.services;

import java.util.ArrayList;
import java.util.List;

import com.exceptions.ResourceNotFoundException;
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

    public JsonResponse find(Integer userId) throws ResourceNotFoundException {

        JsonResponse jsonResponse = new JsonResponse();

        try {
            User user = repository.findById(userId).get();
            jsonResponse.setSuccess(true);
            jsonResponse.setMessage("Data successfully retrieve");
            jsonResponse.getData().add(user);
            return jsonResponse;

        } catch (Exception e) {
            throw new ResourceNotFoundException(e.getLocalizedMessage(), e.getCause());
        }

    }
}
