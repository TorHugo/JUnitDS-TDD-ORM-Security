package com.devsuperior.movieflix.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_roles")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authority;
}
