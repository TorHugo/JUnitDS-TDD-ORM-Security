package com.devsuperior.movieflix.resource;

import com.devsuperior.movieflix.model.dto.ReviewDTO;
import com.devsuperior.movieflix.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<ReviewDTO> insert(@RequestBody @Valid final ReviewDTO dto){
        ReviewDTO reviewDTO = reviewService.adding(dto);
        return ResponseEntity.ok().body(reviewDTO);
    }
}
