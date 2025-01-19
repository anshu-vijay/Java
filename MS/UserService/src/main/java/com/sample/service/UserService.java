package com.sample.service;

import com.sample.entity.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


public interface UserService {

    List<User> getAllUsers();

    ResponseEntity<User> saveUser(User user);

    User getUser(Long userId);
}
