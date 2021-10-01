package com.nuitblanche.triple.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserCreateRequestDto {

    private String username;

    @Builder
    public UserCreateRequestDto(String username) {
        this.username = username;
    }
}
