package com.samsung.greenpoints.service;

import com.samsung.greenpoints.domain.Place;

import java.util.List;

public interface PlaceService {

    Place save(Place place);
    Place findPlaceById(long id);
    Place findPlaceByName(String name);
    List<Place> findAll();
    void deleteById(long id);
    void addFavorite(Long userId, Long placeId);
    void addRating(Long userId, Long placeId, Integer value);
    void addComment(Long userId, Long placeId, String text);


}
