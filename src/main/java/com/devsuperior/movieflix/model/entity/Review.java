package com.devsuperior.movieflix.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_review")
@Data
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String text;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
