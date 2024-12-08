package istad.co.datajpa.service.dto;

import lombok.Builder;

@Builder
public record UserRequest(
        String name,
        String email,
        String username
) {
}
