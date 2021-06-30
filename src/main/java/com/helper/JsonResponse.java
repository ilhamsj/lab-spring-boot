package com.helper;

import java.util.List;

public class JsonResponse {
    private Boolean success;
    private String message;
    private List<Object> data;
    private Integer version = 1;
    private Integer code = 200;

    public JsonResponse(Boolean success, String message, List<Object> data, Integer version, Integer code) {
        super();
        this.success = success;
        this.message = message;
        this.data = data;
        this.version = version;
        this.code = code;
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

    public Integer getVersion() {
        return version;
    }

    public Integer getCode() {
        return code;
    }
}
