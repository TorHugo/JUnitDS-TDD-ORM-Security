package com.devsuperior.movieflix.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class ReviewDTO {
    @NotBlank
    private String text;
    private Long movieId;
}
