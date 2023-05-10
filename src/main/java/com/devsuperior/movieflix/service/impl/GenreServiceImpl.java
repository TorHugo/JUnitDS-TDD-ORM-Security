package com.devsuperior.movieflix.service.impl;

import com.devsuperior.movieflix.model.dto.GenreDTO;
import com.devsuperior.movieflix.model.entity.Genre;
import com.devsuperior.movieflix.repositories.GenreRepository;
import com.devsuperior.movieflix.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public List<GenreDTO> findAllGenres() {
        final List<Genre> lsGenre = genreRepository.findAll();
        return lsGenre.stream().map(GenreDTO::new).collect(Collectors.toList());
    }
}
