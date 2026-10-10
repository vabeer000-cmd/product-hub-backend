package com.producthub.user.entity;

public enum Role {

    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN"),
    PRODUCTOWNER("ROLE_PRODUCTOWNER");

    private final String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}