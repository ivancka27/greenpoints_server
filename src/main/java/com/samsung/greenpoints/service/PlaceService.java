package com.samsung.greenpoints.service;

import com.samsung.greenpoints.domain.Place;

import java.util.List;

public interface PlaceService {

    Place save(Place place);
    Place findPlaceById(long id);
    List<Place> findAll();
    void deleteById(long id);


}
