package com.devsuperior.movieflix.service.impl;

import com.devsuperior.movieflix.exception.impl.ForbiddenException;
import com.devsuperior.movieflix.exception.impl.UnauthorizedException;
import com.devsuperior.movieflix.model.entity.User;
import com.devsuperior.movieflix.repositories.UserRepository;
import com.devsuperior.movieflix.service.AuthService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Objects;

@Service
@Slf4j
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public User authenticated() {
        try {
            log.info("1. Find user to security context.");
            String userName = SecurityContextHolder.getContext().getAuthentication().getName();
            return userRepository.findByEmail(userName);
        } catch (Exception e){
            throw new UnauthorizedException("Invalid user!");
        }
    }

    @Override
    public void validadeSelfOrAdmin(final Long idUser) {
        User user = authenticated();
        if (!Objects.equals(user.getId(), idUser) && !user.hasHole("ROLE_MEMBER"))
            throw new ForbiddenException("Access denied!");
    }

}
