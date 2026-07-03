package dev.andreyrsy.orderly.dto.auth;

import dev.andreyrsy.orderly.model.user.UserRole;

public record RegisterDto(String login, String password) {
}
