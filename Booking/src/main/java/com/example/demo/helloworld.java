package com.example.demo;

public class helloworld {
    public String message;

    public helloworld(String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("HelloWorld[message=%s]",message);
    }
}