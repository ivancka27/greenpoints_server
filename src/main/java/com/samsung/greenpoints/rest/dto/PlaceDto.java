package com.samsung.greenpoints.rest.dto;

import com.samsung.greenpoints.domain.Place;

public class PlaceDto {
    private long id;
    private String name;
    private String imagePath;
    private String address;
    private double rating;
    private String description;
    private int commentsCount;
    private double latitude;
    private double longitude;

    public PlaceDto(long id, String name, String imagePath, String address, double rating, String description, int commentsCount, double latitude, double longitude) {
        this.id = id;
        this.name = name;
        this.imagePath = imagePath;
        this.address = address;
        this.rating = rating;
        this.description = description;
        this.commentsCount = commentsCount;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public static PlaceDto PlaceToDto(Place place){
        return new PlaceDto(place.getId(), place.getName(), place.getPathToImage(), place.getAddress(), place.getRating(), place.getDescription(), place.getCommentsCount(), place.getLatitude(), place.getLongitude());
    }

    public static Place PlaceFromDto(PlaceDto dto){
        return new Place(dto.getId(), dto.getName(), dto.getImagePath(), dto.getAddress(), dto.getRating(), dto.getDescription(), dto.getCommentsCount(), dto.getLatitude(), dto.getLongitude());
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getAddress() {
        return address;
    }

    public double getRating() {
        return rating;
    }

    public String getDescription() {
        return description;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
