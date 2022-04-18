package com.example.university.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.university.repository", "com.example.university.service"})
public class MainConfiguration {
}
