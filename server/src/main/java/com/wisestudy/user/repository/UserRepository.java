package com.wisestudy.user.repository;

import com.wisestudy.user.domain.User;
import com.wisestudy.user.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    Users findAll();
//    User saveAndFlush(User user);
    User save(User user);
}
