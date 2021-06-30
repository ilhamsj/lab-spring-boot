package com.exceptions;

public class ErrorDetails {
    private String message;
    private String details;
    private boolean success;
    private int code;

    public ErrorDetails(String message, String details, Boolean success, int code) {
        super();
        this.message = message;
        this.success = success;
        this.details = details;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public Boolean getSuccess() {
        return success;
    }

    public int getCode() {
        return code;
    }
}
