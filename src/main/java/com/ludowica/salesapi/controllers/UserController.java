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

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable int id) {
        return userRepo.findById(id);
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
        Optional<User> result = userRepo.findById(user.getId());

        if (result != null) {
            return userRepo.save(user);
        }
        return null;
    }
}
