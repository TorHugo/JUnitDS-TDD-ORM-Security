package com.devsuperior.movieflix.service;

import com.devsuperior.movieflix.model.dto.GenreDTO;

import java.util.List;

public interface GenreService {
    List<GenreDTO> findAllGenres();
}
