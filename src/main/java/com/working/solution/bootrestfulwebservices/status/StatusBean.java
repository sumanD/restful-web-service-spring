package com.working.solution.bootrestfulwebservices.status;

public class StatusBean {
    private final String message;

    public StatusBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "StatusBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
