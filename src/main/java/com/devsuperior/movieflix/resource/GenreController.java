package com.devsuperior.movieflix.resource;

import com.devsuperior.movieflix.model.dto.GenreDTO;
import com.devsuperior.movieflix.model.dto.UserDTO;
import com.devsuperior.movieflix.service.GenreService;
import com.devsuperior.movieflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping()
    public ResponseEntity<List<GenreDTO>> getUser(){
        final List<GenreDTO> lsGenre = genreService.findAllGenres();
        return ResponseEntity.ok().body(lsGenre);
    }
}
