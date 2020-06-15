package com.wisestudy.user.controller;

import com.wisestudy.user.domain.User;
import com.wisestudy.user.domain.Users;
import com.wisestudy.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value="")
    public Users getAllUsers() {
        return userService.retrieveAllUsers();
    }

    @GetMapping(value="/{user_id}")
    public User getUser(@PathVariable("user_id") Long userId) {
        return userService.retrieveUser(userId);
    }
    
    @PostMapping(value="")
    public User createUser(@RequestBody User user) {
        return userService.registerUser(user);
    }
}
