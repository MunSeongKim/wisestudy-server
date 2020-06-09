package com.wisestudy.user.controller;

import com.wisestudy.user.domain.User;
import com.wisestudy.user.domain.Users;
import com.wisestudy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping(value="/users")
    public Users getUsers() {
        return userService.retrieveAllUser();
    }

}
