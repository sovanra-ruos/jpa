package istad.co.datajpa.service.dto;

import lombok.Builder;

@Builder
public record UserResponse(
        String name,
        String email,
        String username
) {
}
