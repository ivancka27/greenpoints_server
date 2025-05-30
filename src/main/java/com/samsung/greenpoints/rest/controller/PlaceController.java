package com.samsung.greenpoints.rest.controller;

import com.samsung.greenpoints.domain.Place;
import com.samsung.greenpoints.rest.dto.PlaceDto;

import java.util.List;

public interface PlaceController {

    PlaceDto save(PlaceDto place);
    PlaceDto findPlaceById(long id);
    List<PlaceDto> findAll();
    void deleteById(long id);
}
