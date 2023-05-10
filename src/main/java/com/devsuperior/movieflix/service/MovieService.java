package com.devsuperior.movieflix.service;

import com.devsuperior.movieflix.model.dto.MovieDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MovieService {
    MovieDTO findById(final Long id);

    Page<MovieDTO> findAllPaged(final Pageable pageable);
}
