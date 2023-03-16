package com.example.SpringProjetAtelier1.atelier2.Service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUser(String id) {
        return "User with ID: " + id;
    }
}
