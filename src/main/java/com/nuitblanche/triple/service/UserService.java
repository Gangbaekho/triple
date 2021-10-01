package com.nuitblanche.triple.service;

import com.nuitblanche.triple.domain.user.User;
import com.nuitblanche.triple.domain.user.UserRepository;
import com.nuitblanche.triple.dto.UserCreateRequestDto;
import com.nuitblanche.triple.dto.UserCreateResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserCreateResponseDto createUser(UserCreateRequestDto requestDto){

        Boolean exists = userRepository.existsByUsername(requestDto.getUsername());

        if(exists){
            throw new IllegalArgumentException("already user exists name : " + requestDto.getUsername());
        }

        User user = User.builder()
                .username(requestDto.getUsername())
                .build();

        userRepository.save(user);

        return new UserCreateResponseDto(user);
    }


}
