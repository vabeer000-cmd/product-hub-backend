package com.producthub.user.dto;

import com.producthub.user.entity.Role;
import lombok.Getter;

@Getter
public class LoginResponse {

    private String accessToken;
    private String refreshToken;
    private String username;
    private Long userId;
    private Role role;

    public LoginResponse(
            String accessToken,
            String refreshToken,
            String username,
            Long userId,
            Role role) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.username = username;
        this.userId = userId;
        this.role = role;
    }


}