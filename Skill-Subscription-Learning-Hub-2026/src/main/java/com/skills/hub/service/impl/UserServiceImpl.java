package com.skills.hub.service.impl;

import com.skills.hub.model.User;
import com.skills.hub.repository.UserRepository;
import com.skills.hub.service.UserService;
import org.springframework.stereotype.Service;

/*
=========================================================
WHAT IS THIS CLASS?
=========================================================

This class contains BUSINESS LOGIC for users.

 Controller calls this
 This class talks to repository

=========================================================
*/

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User registerUser(User user) {

        // =========================
        // TASK
        // =========================
        // STEP 1: check if email already exists
        // STEP 2: if exists → stop process
        // STEP 3: if not → save user to DB
        // STEP 4: return saved user
        //Checking if email already exists
        User existingUser = userRepo.findByEmail(user.getEmail());

        return null;
        //If exists, stop process
        if (existingUser != null) {
            return null;
        }

        //Else Save user to DB
        User savedUser = userRepo.save(user);

        //Then return saved user
        return savedUser;
    }

    @Override
    public User login(String email, String password) {

        // =========================
        // TASK
        // =========================
        // STEP 1: find user by email
        // STEP 2: if user not found → return null
        // STEP 3: check password match
        // STEP 4: if correct → return user
        // STEP 5: else → return null
        //We find user by email
        User user = userRepo.findByEmail(email);

        // If user not found we return
        if (user == null) {
            return null;
        }

        //Check password and return user
        if (user.getPassword().equals(password)) {
            return user;
        }

        //If password incorrect
        return null;
    }
}
}
