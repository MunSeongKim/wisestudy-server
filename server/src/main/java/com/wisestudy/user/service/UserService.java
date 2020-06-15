package com.wisestudy.user.service;

import com.wisestudy.user.domain.User;
import com.wisestudy.user.domain.Users;
import com.wisestudy.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users retrieveAllUsers() {
        return userRepository.findAll();
    }

    public User retrieveUser(Long userId) {
        return userRepository.findById(userId);
    }

    public User registerUser(User user) {
        return userRepository.save(user);
    }
}
