package com.wisestudy.user.service;

import com.wisestudy.user.domain.User;
import com.wisestudy.user.domain.Users;
import com.wisestudy.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Users retrieveAllUser() {
        return userRepository.findAll();
    }

    public Boolean registUser(User user) {
        return userRepository.save(user) != null ? true : false;
    }
}
