package com.devsuperior.movieflix.service;

import com.devsuperior.movieflix.model.dto.UserDTO;
import org.springframework.stereotype.Component;

@Component
public interface UserService {
    UserDTO findUser();
}
