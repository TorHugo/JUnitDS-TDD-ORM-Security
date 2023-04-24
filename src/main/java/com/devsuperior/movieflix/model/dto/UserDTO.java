package com.devsuperior.movieflix.model.dto;

import com.devsuperior.movieflix.model.entity.Review;
import com.devsuperior.movieflix.model.entity.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDTO {
    private Long id;
    private String name;
    private String email;

    public UserDTO(User entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.email = entity.getEmail();
    }
}
