package com.samsung.greenpoints.repository;

import com.samsung.greenpoints.domain.Comment;
import com.samsung.greenpoints.domain.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    long countByPlace(Place place);
}
