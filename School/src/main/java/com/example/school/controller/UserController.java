package com.example.school.controller;


import com.example.school.entity.User;
import com.example.school.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/registration")
    public boolean createUser(User user) {
        return userService.createUser(user);
    }
}