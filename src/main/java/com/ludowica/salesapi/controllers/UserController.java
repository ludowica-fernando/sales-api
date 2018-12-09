package com.ludowica.salesapi.controllers;

import com.ludowica.salesapi.models.User;
import com.ludowica.salesapi.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepo userRepo;

    @GetMapping("/{userid}")
    public Optional<User> getUser(@PathVariable int userId) {
        return userRepo.findById(userId);
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @PutMapping
    public User updateUser(@RequestBody User user) {
        Optional<User> result = userRepo.findById(user.getUserid());

        if (result != null) {
            return userRepo.save(user);
        }
        return null;
    }
}
