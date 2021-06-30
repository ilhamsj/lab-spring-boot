package com.helper;

import java.util.List;

public class JsonResponse {
    private Boolean success;
    private String message;
    private List<Object> data;

    public JsonResponse(Boolean success, String message, List<Object> data) {
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

    public List<Object> getData() {
        return data;
    }
}
