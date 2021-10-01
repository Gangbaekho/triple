package com.nuitblanche.triple.dto;

import com.nuitblanche.triple.domain.place.Place;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PlaceCreateResponseDto {

    private Long id;
    private String placename;

    public PlaceCreateResponseDto(Place place) {
        this.id = place.getId();
        this.placename = place.getPlacename();
    }
}
