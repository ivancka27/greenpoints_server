package com.samsung.greenpoints.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "place_id")
    private Place place;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String text;

    private LocalDateTime date;

    public Comment() {}

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Place getPlace() {
        return place;
    }

    public String getText() {
        return text;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}
