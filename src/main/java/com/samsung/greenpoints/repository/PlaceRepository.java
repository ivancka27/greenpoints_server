package com.samsung.greenpoints.repository;

import com.samsung.greenpoints.domain.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {

    Place findPlaceById(long id);
    Place findPlaceByName(String name);
    Place save(Place place);
}
