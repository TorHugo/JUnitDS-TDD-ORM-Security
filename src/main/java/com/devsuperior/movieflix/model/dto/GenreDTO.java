package com.devsuperior.movieflix.model.dto;

import com.devsuperior.movieflix.model.entity.Genre;
import lombok.Data;

@Data
public class GenreDTO {
    private Long id;
    private String name;

    public GenreDTO (Genre genre){
        this.id = genre.getId();
        this.name = genre.getName();
    }
}
