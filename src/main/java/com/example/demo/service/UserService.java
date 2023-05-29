package com.example.demo.service;

import com.example.demo.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(User user);
    User getUser(User user);
    User updateUser(User user);
    void deleteUser(User user);
    User getUserByEmail(String email);
}
