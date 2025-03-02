package com.cpg.userservice.dto;

import lombok.Data;

@Data
public class UserResponse {
    private UserDto user;
    private String message;
}
