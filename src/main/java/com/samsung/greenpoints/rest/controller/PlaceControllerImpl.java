package com.samsung.greenpoints.rest.controller;

import com.samsung.greenpoints.domain.Place;
import com.samsung.greenpoints.rest.dto.PlaceDto;
import com.samsung.greenpoints.rest.dto.UserActionDto;
import com.samsung.greenpoints.rest.dto.UserDto;
import com.samsung.greenpoints.service.PlaceService;
import com.samsung.greenpoints.service.PlaceServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/place")
public class PlaceControllerImpl implements PlaceController{
    private final PlaceService placeService;

    public PlaceControllerImpl(PlaceService placeService) {
        this.placeService = placeService;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable long id) {
        placeService.deleteById(id);
    }

    @PostMapping
    @Override
    public PlaceDto save(@RequestBody PlaceDto place) {
        return PlaceDto.PlaceToDto(placeService.save(PlaceDto.PlaceFromDto(place)));
    }

    @GetMapping("/{id}")
    @Override
    public PlaceDto findPlaceById(@PathVariable long id) {
        return PlaceDto.PlaceToDto(placeService.findPlaceById(id));
    }

    @GetMapping("/byName")
    @Override
    public PlaceDto findPlaceByName(@RequestParam String name) {
        return PlaceDto.PlaceToDto(placeService.findPlaceByName(name));
    }

    @GetMapping
    @Override
    public List<PlaceDto> findAll() {
        return placeService.findAll().stream().map(e -> PlaceDto.PlaceToDto(e)).toList();
    }

    @PostMapping("/favorite")
    public ResponseEntity<Void> addToFavorites(@RequestBody UserActionDto dto) {
        placeService.addFavorite(dto.getUserId(), dto.getPlaceId());
        return ResponseEntity.ok().build();
    }

    // Добавление оценки
    @PostMapping("/rate")
    public ResponseEntity<Void> ratePlace(@RequestBody UserActionDto dto) {
        placeService.addRating(dto.getUserId(), dto.getPlaceId(), (Integer) dto.getPayload());
        return ResponseEntity.ok().build();
    }

    // Добавление комментария
    @PostMapping("/comment")
    public ResponseEntity<Void> commentPlace(@RequestBody UserActionDto dto) {
        placeService.addComment(dto.getUserId(), dto.getPlaceId(), (String) dto.getPayload());
        return ResponseEntity.ok().build();
    }

}
