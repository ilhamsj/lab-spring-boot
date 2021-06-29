package com.helper;

import java.util.List;

import com.models.User;

public class JsonResponse {
    private Boolean success;
    private String message;
    private List<User> data;

    public JsonResponse(Boolean success, String message, List<User> data) {
        super();
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public List<User> getData() {
        return data;
    }
}
