package com.devsuperior.movieflix.service.impl;

import com.devsuperior.movieflix.model.dto.UserDTO;
import com.devsuperior.movieflix.model.entity.User;
import com.devsuperior.movieflix.repositories.UserRepository;
import com.devsuperior.movieflix.service.AuthService;
import com.devsuperior.movieflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private AuthService authService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repository.findByEmail(email);
        if (user == null)
            throw new UsernameNotFoundException("Email not found.");

        return user;
    }

    @Override
    public UserDTO findUser() {
        final User user = authService.authenticated();
        authService.validadeSelfOrAdmin(user.getId());

        final User userRecupered = repository.findById(user.getId())
                .orElseThrow();

        return new UserDTO(userRecupered);
    }
}
