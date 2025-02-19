package com.devsuperior.movieflix.repositories;

import com.devsuperior.movieflix.model.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
