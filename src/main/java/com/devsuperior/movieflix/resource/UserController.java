package com.devsuperior.movieflix.resource;

import com.devsuperior.movieflix.model.dto.UserDTO;
import com.devsuperior.movieflix.model.entity.User;
import com.devsuperior.movieflix.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/profile")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<UserDTO> getUser(){
        final UserDTO user = userService.findUser();
        return ResponseEntity.ok().body(user);
    }
}
