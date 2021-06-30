package com.helper;

import java.util.ArrayList;
import java.util.List;

public class JsonResponse {
    private Boolean success;
    private String message;
    private List<Object> data;
    private Integer code = 200;
    private Integer version = 1;

    public JsonResponse() {

    }

    public JsonResponse(Boolean success, String message, List<Object> data, Integer version, Integer code) {
        super();
        this.success = success;
        this.message = message;
        this.data = data;
        this.version = version;
        this.code = code;
    }

    public Boolean isSuccess() {
        return this.success;
    }

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Object> getData() {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        return this.data;
    }

    public void setData(List<Object> data) {
        this.data = data;
    }

    public Integer getVersion() {
        return this.version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
