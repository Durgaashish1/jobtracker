package com.example.jobtracker.service;

import com.example.jobtracker.model.User;

public interface UserService {
    User getUserByUsername(String username);
    boolean existsByUsername(String username);
    void saveUser(User user);
    // Other user-related methods if needed
}