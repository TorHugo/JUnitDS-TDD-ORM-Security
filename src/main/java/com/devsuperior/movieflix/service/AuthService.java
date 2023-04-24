package com.devsuperior.movieflix.service;

import com.devsuperior.movieflix.model.entity.User;

public interface AuthService {
    User authenticated();
    void validadeSelfOrAdmin(final Long idUser);
}
