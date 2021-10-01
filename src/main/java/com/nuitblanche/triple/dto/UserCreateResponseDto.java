package com.nuitblanche.triple.dto;

import com.nuitblanche.triple.domain.user.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserCreateResponseDto {

    private Long id;
    private String username;

    public UserCreateResponseDto(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
    }
}
