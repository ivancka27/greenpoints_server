package com.samsung.greenpoints.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "pathToImage")
    private String pathToImage;

    @Column(name = "address")
    private String address;

    @Column(name = "rating")
    private double rating;

    @Column(name = "description")
    private String description;

    @Column(name = "commentsCount")
    private int commentsCount;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    public Place(long id, String name, String pathToImage, String address, double rating, String description, int commentsCount, double latitude, double longitude) {
        this.id = id;
        this.name = name;
        this.pathToImage = pathToImage;
        this.address = address;
        this.rating = rating;
        this.description = description;
        this.commentsCount = commentsCount;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPathToImage() {
        return pathToImage;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
