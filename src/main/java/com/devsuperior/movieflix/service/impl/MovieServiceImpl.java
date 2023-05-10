package com.devsuperior.movieflix.service.impl;

import com.devsuperior.movieflix.exception.impl.ResourceNotFoundException;
import com.devsuperior.movieflix.model.dto.MovieDTO;
import com.devsuperior.movieflix.model.entity.Movie;
import com.devsuperior.movieflix.repositories.GenreRepository;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public MovieDTO findById(Long id) {
        final Movie movie = movieRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Entity not found!"));
        return new MovieDTO(movie);
    }

    @Override
    public Page<MovieDTO> findAllPaged(Pageable pageable) {
        Page<Movie> list = movieRepository.findAllSorted(pageable);
        return list.map(MovieDTO::new);
    }
}
