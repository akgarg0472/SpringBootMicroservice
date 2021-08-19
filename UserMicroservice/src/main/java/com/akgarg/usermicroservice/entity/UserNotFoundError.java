package com.akgarg.usermicroservice.entity;

@SuppressWarnings("unused")
public class UserNotFoundError {
    private String errorMessage;

    public UserNotFoundError(int userId) {
        this.errorMessage = "Sorry, Requested user with userId=" + userId + " not found";
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString() {
        return "ErrorUser{" +
                "errorMessage='" + errorMessage + '\'' +
                '}';
    }
}