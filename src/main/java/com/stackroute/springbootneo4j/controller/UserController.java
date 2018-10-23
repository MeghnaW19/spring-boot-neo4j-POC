package com.stackroute.springbootneo4j.controller;

import com.stackroute.springbootneo4j.domain.User;
import com.stackroute.springbootneo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("users")
    public Collection<User> getAll() {
        return userService.getAll();
    }
}
