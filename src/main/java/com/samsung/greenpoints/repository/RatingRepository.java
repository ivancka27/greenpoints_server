package com.samsung.greenpoints.repository;

import com.samsung.greenpoints.domain.Place;
import com.samsung.greenpoints.domain.Rating;
import com.samsung.greenpoints.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    Optional<Rating> findByUserAndPlace(User user, Place place);

    @Query("SELECT AVG(r.value) FROM Rating r WHERE r.place = :place")
    Double findAverageRatingByPlace(Place place);
}
