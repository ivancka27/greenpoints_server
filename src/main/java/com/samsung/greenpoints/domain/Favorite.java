package com.samsung.greenpoints.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "place_id")
    private Place place;

    private LocalDateTime addedDate;
}
