package com.devsuperior.movieflix.resource;

import com.devsuperior.movieflix.model.dto.MovieDTO;
import com.devsuperior.movieflix.model.dto.MovieGenreDTO;
import com.devsuperior.movieflix.service.MovieService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<MovieDTO> movieById(@PathVariable final Long id){
        MovieDTO movie = movieService.findById(id);
        return ResponseEntity.ok().body(movie);
    }
    @GetMapping
    public ResponseEntity<Page<MovieDTO>> findAllSorted(Pageable pageable){
        Page<MovieDTO> lsMovies = movieService.findAllPaged(pageable);
        return ResponseEntity.ok().body(lsMovies);
    }
}
