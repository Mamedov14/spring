package com.example.auth;

import com.example.auth.entity.Role;
import com.example.auth.entity.User;
import com.example.auth.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class AuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }

    @Bean
    CommandLineRunner run(UserService userService) {
        return args -> {
            userService.saveRole(new Role(null, "USER"));
            userService.saveRole(new Role(null, "ADMIN"));

            userService.saveUser(new User(null, "Vagif", "vaga", "123", new ArrayList<>()));
            userService.saveUser(new User(null, "Ruslan", "rus", "123", new ArrayList<>()));

            userService.addRoleToUser("vaga", "ADMIN");
            userService.addRoleToUser("rus", "USER");
        };
    }
}