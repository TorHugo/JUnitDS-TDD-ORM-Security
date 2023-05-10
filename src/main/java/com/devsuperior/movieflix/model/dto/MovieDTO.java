package com.devsuperior.movieflix.model.dto;

import com.devsuperior.movieflix.model.entity.Movie;
import lombok.Data;

@Data
public class MovieDTO {

    private Long id;
    private String title;
    private String subTitle;
    private Integer year;
    private String imgUrl;
    private String synopsis;
    private GenreDTO genre;

    public MovieDTO(Movie movie){
        this.id = movie.getId();
        this.title = movie.getTitle();
        this.subTitle = movie.getSubTitle();
        this.year = movie.getYear();
        this.imgUrl = movie.getImgUrl();
        this.synopsis = movie.getSynopsis();
        this.genre = new GenreDTO(movie.getGenre());
    }
}
