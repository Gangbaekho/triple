package com.nuitblanche.triple.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PlaceCreateRequestDto {

    private String placename;

    @Builder
    public PlaceCreateRequestDto(String placename) {
        this.placename = placename;
    }
}
