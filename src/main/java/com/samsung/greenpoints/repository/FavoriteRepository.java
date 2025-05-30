package com.samsung.greenpoints.repository;

import com.samsung.greenpoints.domain.Favorite;
import com.samsung.greenpoints.domain.Place;
import com.samsung.greenpoints.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    boolean existsByUserAndPlace(User user, Place place);
}
