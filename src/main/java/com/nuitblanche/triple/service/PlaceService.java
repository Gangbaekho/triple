package com.nuitblanche.triple.service;

import com.nuitblanche.triple.domain.place.Place;
import com.nuitblanche.triple.domain.place.PlaceRepository;
import com.nuitblanche.triple.dto.PlaceCreateRequestDto;
import com.nuitblanche.triple.dto.PlaceCreateResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Service
public class PlaceService {

    private final PlaceRepository placeRepository;

    @Transactional
    public PlaceCreateResponseDto createPlace(@RequestBody PlaceCreateRequestDto requestDto){

        Boolean exists = placeRepository.existsByPlacename(requestDto.getPlacename());

        if(exists){
            throw new IllegalArgumentException("alreay exists place name : " + requestDto.getPlacename());
        }

        Place place = Place.builder()
                .placename(requestDto.getPlacename())
                .build();

        placeRepository.save(place);

        return new PlaceCreateResponseDto(place);
    }
}
