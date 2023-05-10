package com.devsuperior.movieflix.service.impl;

import com.devsuperior.movieflix.model.dto.ReviewDTO;
import com.devsuperior.movieflix.model.entity.Review;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import com.devsuperior.movieflix.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public ReviewDTO adding(ReviewDTO dto) {
        reviewRepository.save(mapper(dto));
        return dto;
    }

    private Review mapper(final ReviewDTO dto){
        Review entity = new Review();
        entity.setText(dto.getText());
        entity.setMovie(movieRepository.findById(dto.getMovieId()).orElse(null));
        return entity;
    }
}
