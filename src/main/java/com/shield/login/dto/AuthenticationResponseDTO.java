package com.shield.login.dto;

public class AuthenticationResponseDTO {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AuthenticationResponseDTO(String token) {
        this.token = token;
    }
}

