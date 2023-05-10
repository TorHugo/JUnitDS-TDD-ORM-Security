package com.devsuperior.movieflix.repositories;

import com.devsuperior.movieflix.model.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query(value = "SELECT obj.* FROM TB_MOVIE obj ORDER BY title ASC", nativeQuery = true)
    Page<Movie> findAllSorted(final Pageable pageable);

    @Query(value = "SELECT obj.* FROM TB_MOVIE obj WHERE genre_id = :genreId", nativeQuery = true)
    Page<Movie> findAllByGenreId(final Long genreId, final Pageable pageable);
}
