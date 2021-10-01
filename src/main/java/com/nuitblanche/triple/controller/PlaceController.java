package com.nuitblanche.triple.controller;

import com.nuitblanche.triple.dto.PlaceCreateRequestDto;
import com.nuitblanche.triple.dto.PlaceCreateResponseDto;
import com.nuitblanche.triple.service.PlaceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/places")
@RestController
public class PlaceController {

    private final PlaceService placeService;

    @PostMapping("")
    public PlaceCreateResponseDto createPlace(@RequestBody PlaceCreateRequestDto requestDto){

        return placeService.createPlace(requestDto);
    }


}
