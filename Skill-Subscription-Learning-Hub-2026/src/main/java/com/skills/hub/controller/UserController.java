package com.skills.hub.controller;

import com.skills.hub.model.User;
import com.skills.hub.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*
=========================================================
WHAT IS THIS FILE?
Handles user actions like register and login
=========================================================
*/

@Controller
public class UserController {

    @GetMapping("/register")
    public String showRegisterPage() {

        // =========================
        // TASK
        // =========================
        // STEP 1: Return register page

        return null; // TODO: "register"
        //Return register page
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {

        // =========================
        //TASK
        // =========================
        // STEP 1: call service.registerUser(user)
        // STEP 2: if success → redirect to login
        // STEP 3: else → stay on register page
        
        User savedUser = userService.registerUser(user);

        
        if (savedUser != null) {
            return "redirect:/login";
        }

        return null;
        return "register";
    }

    @GetMapping("/login")
    public String showLoginPage() {

        // STEP 1: return login page

        return null; // TODO: "login"
        
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                         @RequestParam String password) {
                        @RequestParam String password) {

        
        User user = userService.login(email, password);

        // =========================
        // PSEUDO CODE
        // =========================
        // STEP 1: call userService.login(email, password)
        // STEP 2: if user != null → redirect /packs
        // STEP 3: else → return login page again
        
        if (user != null) {
            return "redirect:/packs";
        }

        return null;
        return "login";
    }

	public UserService getUserService() {
		return userService;
	}
}
    public UserService getUserService() {
        return userService;
    }
}
