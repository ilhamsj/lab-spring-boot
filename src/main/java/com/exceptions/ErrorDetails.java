package com.exceptions;

public class ErrorDetails {
    private String message;
    private String details;
    private Boolean success;

    public ErrorDetails(String message, String details, Boolean success) {
        super();
        this.message = message;
        this.success = success;
        this.details = details;
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
}
