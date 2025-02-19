package com.devsuperior.movieflix.repositories;

import com.devsuperior.movieflix.model.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
