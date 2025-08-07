package com.felipe.springjwtauth.dto;

public record LoginResponse(String accessToken, long expiresIn) {
}
