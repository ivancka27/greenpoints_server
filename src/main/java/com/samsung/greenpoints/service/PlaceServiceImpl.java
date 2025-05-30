package com.samsung.greenpoints.service;

import com.samsung.greenpoints.domain.*;
import com.samsung.greenpoints.exceptions.IdNotValidException;
import com.samsung.greenpoints.exceptions.UserNotFoundException;
import com.samsung.greenpoints.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PlaceServiceImpl implements PlaceService{

    private UserRepository userRepository;
    private PlaceRepository placeRepository;
    private FavoriteRepository favoriteRepository;
    private RatingRepository ratingRepository;
    private CommentRepository commentRepository;

    public PlaceServiceImpl() {
    }

    @Autowired
    public PlaceServiceImpl(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public PlaceServiceImpl(UserRepository userRepository, PlaceRepository placeRepository, FavoriteRepository favoriteRepository, RatingRepository ratingRepository, CommentRepository commentRepository) {
        this.userRepository = userRepository;
        this.placeRepository = placeRepository;
        this.favoriteRepository = favoriteRepository;
        this.ratingRepository = ratingRepository;
        this.commentRepository = commentRepository;
    }

    public Place save(Place place) {
        return placeRepository.save(place);
    }

    public Place findPlaceById(long id) {
        if(id <= 0) throw new IdNotValidException("Id must be positive!");
        return placeRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException("Place with id " + id + " was not found"));
    }

    @Override
    public Place findPlaceByName(String name) {
        return placeRepository.findPlaceByName(name);
    }

    public List<Place> findAll() {
        return placeRepository.findAll();
    }

    @Override
    public void deleteById(long id) {
        placeRepository.deleteById(id);
    }


    public void addFavorite(Long userId, Long placeId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Place place = placeRepository.findById(placeId)
                .orElseThrow(() -> new IllegalArgumentException("Place not found"));

        // Проверяем, есть ли уже избранное
        boolean exists = favoriteRepository.existsByUserAndPlace(user, place);
        if (!exists) {
            Favorite favorite = new Favorite();
            favorite.setUser(user);
            favorite.setPlace(place);
            favorite.setAddedDate(LocalDateTime.now());
            favoriteRepository.save(favorite);
        }
    }

    public void addRating(Long userId, Long placeId, Integer value) {
        if (value == null || value < 1 || value > 5) {
            throw new IllegalArgumentException("Rating value must be between 1 and 5");
        }

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Place place = placeRepository.findById(placeId)
                .orElseThrow(() -> new IllegalArgumentException("Place not found"));

        // Можно обновлять существующую оценку или создавать новую
        Optional<Rating> existingRating = ratingRepository.findByUserAndPlace(user, place);
        Rating rating = existingRating.orElseGet(Rating::new);
        rating.setUser(user);
        rating.setPlace(place);
        rating.setValue(value);
        ratingRepository.save(rating);

        // Обновляем средний рейтинг места
        updatePlaceAverageRating(place);
    }

    public void addComment(Long userId, Long placeId, String text) {
        if (text == null || text.trim().isEmpty()) {
            throw new IllegalArgumentException("Comment text cannot be empty");
        }

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        Place place = placeRepository.findById(placeId)
                .orElseThrow(() -> new IllegalArgumentException("Place not found"));

        Comment comment = new Comment();
        comment.setUser(user);
        comment.setPlace(place);
        comment.setText(text.trim());
        comment.setDate(LocalDateTime.now());
        commentRepository.save(comment);

        // Обновляем количество комментариев у места
        updatePlaceCommentsCount(place);
    }

    private void updatePlaceAverageRating(Place place) {
        Double avgRating = ratingRepository.findAverageRatingByPlace(place);
        place.setRating(avgRating != null ? avgRating : 0.0);
        placeRepository.save(place);
    }

    private void updatePlaceCommentsCount(Place place) {
        Long count = commentRepository.countByPlace(place);
        place.setCommentsCount(count.intValue());
        placeRepository.save(place);
    }

}
